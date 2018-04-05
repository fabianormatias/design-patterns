package composite;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class IOUtils {

	/**
     * Diretorio User
	 */
	public static final String USER_DIR = System.getProperty("user.dir");
	
	/**
	 * Separador de diretorio '\' ou '/'
	 */
	public static final String SEPARATOR = System.getProperty("file.separator");
	
	/**
	 * Separador de linhas '\n'
	 */
	public static final String NEWLINE = System.getProperty("line.separator");
	
	/**
	 * Verifica o nome do sistema operacional.
	 */
	public static final String OPERATING_SYSTEM = System.getProperty("os.name");
	
	/**
	 * Representa a tecla ENTER do teclado. Adiciona uma quebra de linha no text.
	 */
	public static final String ENTER = "\n";

	private static IOUtils instance = new IOUtils();

	public IOUtils() {}

	public static IOUtils getInstance() {
		return instance;
	}

	/**
	 * Cria uma pasta no local especificado.
	 *
	 * @param path
	 *            exemplo path "c:/tests/io"
	 */
	public void createFolder(String path) {
		if (!exist(path)) {
			File folder = new File(path);
			folder.mkdirs();
		}
	}

	/**
	 * Criar um arquivo de texto no local especificado, verificando se o lugar existe, se nao existir, sera criado.
	 *
	 * @param path
	 *            exemplo "c:/tests/io"
	 * @param fileName
	 *            exemplo file.txt
	 * @param content
	 * 			  conteudo
	 * @param overwrite
	 *            true or false - Informa se o arquivo deve ser substituido
	 */
	public void createFile(String path, String fileName, String content, boolean overwrite) {
		if (!exist(path))
			createFolder(path);
		
		saveFile(path + SEPARATOR + fileName, content, overwrite);
	}

	/**
	 *
	 * @param path
	 *            exemplo "c:/tests/io"
	 * @param filename
	 *            exemplo file.txt
	 * @param content
	 *            conteudo
	 * @param overwrite
	 *            true or false - Informa se o arquivo deve ser substituido
	 */
	public void createFile(Path path, String filename, byte[] content, boolean overwrite) {
		if (!exist(path.toString()))
			createFolder(path.toString());

		Path pathWithFilename = path.resolve(filename);
		saveFile(pathWithFilename, content, overwrite);
	}

	/**
	 * Remove uma pasta no local especificado.
	 *
	 * @param path
	 *            exemplo de path "c:/tests/io"
	 */
	public void deleteFolder(String path) {
		if (exist(path))
			deleteAll(path);
	}

	/**
	 * Deletar um arquivo.
	 *
	 * @param path
	 *            exemplo de path "c:/tests/io/file.txt"
	 */
	public void deleteFile(String path) {
		if (exist(path)) {
			File file = new File(path);
			if (file.isFile())
				file.delete();
		}
	}

	/**
	 * Deleta todos os arquivos do diretorio
	 *
	 * @param path
	 *            o caminho de um diretorio no sistema.
	 */
	public void deleteAll(String path) {
		deleteAll(new File(path));
	}

	/**
	 * Delete diretorios recursivavmente, subpastas e arquivos.
	 *
	 * @param file
	 *            objeto do tipo File
	 */
	public void deleteAll(File file) {
		if (file.isFile()) {
			file.delete();
		} else {
			File[] files = file.listFiles();
			for (File f : files)
				deleteAll(f);
			file.delete();
		}
	}

	/**
	 *
	 * @param path
	 *           exemplo de path "c:/tests/io/file.txt"
	 * @param content
	 * @param overwrite
	 */
	public void saveFile(Path path, byte[] content, boolean overwrite) {
		try {
			if (overwrite)
				Files.write(path, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			else
				Files.write(path, content, StandardOpenOption.CREATE);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 *
	 * @param fileName
	 * @param content
	 * @param overwrite
	 */
	public void saveFile(String fileName, String content, boolean overwrite) {
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(new File(fileName), overwrite);
			output.write(content.getBytes());
			output.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}

	/**
	 * Abre o arquivo no caminho informado.
	 *
	 * @param path
	 *            exemplo "c:/tests/io/file.txt"
	 *
	 * @return String
	 */
	public String openFile(String path) {
		StringBuilder returnValue = new StringBuilder();
		FileReader file = null;
		try {
			file = new FileReader(path);
			BufferedReader reader = new BufferedReader(file);
			String line = "";
			while ((line = reader.readLine()) != null) {
				returnValue.append(line);
				returnValue.append(ENTER);
			}
			reader.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		return returnValue.toString();
	}

	/**
	 * Abre o arquivo no caminho informado.
	 *
	 * @param path
	 *            exemplo "c:/tests/io/file.txt"
	 *
	 * @return String
	 */
	public static List<String> openFileList(String path) {
		List<String> returnValue = new ArrayList<>();
		FileReader file = null;
		try {
			file = new FileReader(path);
			BufferedReader reader = new BufferedReader(file);
			String line = "";
			while ((line = reader.readLine()) != null) {
				returnValue.add(line);
			}
			reader.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		return returnValue;
	}

	/**
	 * Copiar um arquivo de um local para outro.
	 *
	 * @param origin
	 *            origin path
	 * @param destination
	 *            destiny path
	 * @param overwrite
	 *            confirmation to overwrite
	 *
	 * @throws IOException
	 */
	public void copy(File origin, File destination, boolean overwrite) {
		try {
			if (destination.exists() && !overwrite)
				return;
			
			if (destination.isFile() && !destination.exists())
				destination.createNewFile();
			
			if (destination.isDirectory() && !destination.exists())
				destination.mkdirs();
			
			FileInputStream fisOrigem = new FileInputStream(origin);
			FileOutputStream fisDestino = new FileOutputStream(destination);
			FileChannel fcOrigem = fisOrigem.getChannel();
			FileChannel fcDestino = fisDestino.getChannel();
			fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);
			fisOrigem.close();
			fisDestino.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Fazer copia de um arquivo.
	 *
	 * @param reader
	 * @param writer
	 *
	 * @throws IOException
	 */
	public void copy(Reader reader, Writer writer) {
		try {
			BufferedReader bufReader = new BufferedReader(reader);
			String line;
			
			while (null != (line = bufReader.readLine()))
				writer.write(line + '\n');
			
			writer.flush();
			writer.close();
			bufReader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());		
		}
	}

	/**
	 * Copiar um diretorio, indicar os caminhos de origem e destino.
	 *
	 * @param originPath
	 *            endereco de origem do arquivo.
	 * @param destinationPath
	 *            endereco de destino do arquivo.
	 *
	 * @throws IOException
	 */
	public void copy(String originPath, String destinationPath) {
		try {
			if (!exist(destinationPath))
				createFolder(destinationPath);
			
			InputStream in = new FileInputStream(originPath);
			OutputStream out = new FileOutputStream(destinationPath, false);
			copy(new InputStreamReader(in), new OutputStreamWriter(out));
		} catch (IOException e) {
			System.err.println(e.getMessage());			
		}
	}

	/**
	 * Copiar um arquivo indicar os caminhos de origem e destino.
	 *
	 * @param originPath
	 * @param destinationPath
	 * @param fileName
	 *
	 * @throws IOException
	 */
	public void copy(String originPath, String destinationPath, String fileName) {
		if (!exist(destinationPath))
			createFolder(destinationPath);
		
		copy(originPath + SEPARATOR + fileName, destinationPath + SEPARATOR + fileName);
	}

	/**
	 * Copie todos os arquivos de um diretorio para outro.
	 *
	 * @param originPath
	 *            endereco de origem do arquivo.
	 * @param destinationPath
	 *            endereco de destino do arquivo.
	 * @param overwrite
	 *            confirmation to overwrite.
	 *
	 * @throws IOException
	 */
	public void copyAll(File originPath, File destinationPath, boolean overwrite) {
		if (!destinationPath.exists())
			destinationPath.mkdir();
		
		if (!originPath.isDirectory())
			throw new UnsupportedOperationException("Diretorio [" + originPath.getParent() + "] nao existe!");

		if (!destinationPath.isDirectory() || !destinationPath.exists())
			throw new UnsupportedOperationException("Diretorio [" + destinationPath.getParent() + "] nao existe!");

		File[] files = originPath.listFiles();

		for (File file : files) {
			if (file.isDirectory())
				copyAll(file, new File(destinationPath + SEPARATOR + file.getName()), overwrite);
			else
				copy(file, new File(destinationPath + SEPARATOR + file.getName()), overwrite);
		}
	}

	/**
	 * Renomear um arquivo.
	 *
	 * @param path
	 *            file path
	 * @param filename
	 *            old file name
	 * @param newName
	 *            new file name
	 */
	public void renameFile(String path, String filename, String newName) {
		if (exist(path + SEPARATOR + filename)) {
			File file = new File(path + SEPARATOR + filename);
			file.renameTo(new File(path + SEPARATOR + newName));
		}
	}

	/**
	 * Mover um arquivo de origem para o destino.
	 *
	 * @param originPath
	 *            exemplo "c:/tests/io"
	 * @param destinationPath
	 *            exemplo "c:/tests/svn"
	 * @param fileName
	 *            exemplo "file.xml"
	 *
	 * @throws IOException
	 *             File not found or permission denied access.
	 */
	public void moveFile(String originPath, String destinationPath, String fileName) {
		File origin = new File(originPath + SEPARATOR + fileName);
		if (!exist(destinationPath))
			createFolder(destinationPath);
		
		File destiny = new File(destinationPath + SEPARATOR + fileName);
		copy(origin, destiny, true);
		origin.delete();
	}

	/**
	 * Verificar se um arquivo ou diretorio existe.
	 *
	 * @param path
	 *            exemplo de path "c:/tests/io"
	 *
	 * @return true ou false
	 */
	public boolean exist(String path) {
		File file = new File(path);
		return file.exists();
	}

	/**
	 * Divide o caminho em partes.
	 *
	 * @param path
	 *
	 * @return String[]
	 */
	public String[] getSegments(String path) {
		if (path.contains("/"))
			return path.split("/");
		
		String pattern = Pattern.quote(SEPARATOR);
		return path.split(pattern);
	}

	/**
	 * Pega a ultima parte do caminho.
	 *
	 * @param path
	 *
	 * @return String
	 */
	public String getLastSegment(String path) {
		String[] segments = getSegments(path);
		return segments[segments.length - 1];
	}

	/**
	 * Remove a ultima parte do caminho.
	 *
	 * @param path
	 *
	 * @return String
	 */
	public String removeLastSegment(String path) {
		String last = getLastSegment(path);
		return path.replace(last, "");
	}

	/**
	 * Listando todos os arquivos em uma pasta.
	 *
	 * @param path
	 *
	 * @return File[]
	 */
	public File[] listFiles(String path) {
		File f = new File(path);
		return f.listFiles();
	}
	
}