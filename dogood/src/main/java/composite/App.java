package composite;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class App {

    static final String PATH = "/home/fabiano/Developer/workspace/jobs/2018/201804/20180404/data-marketing-structure.csv";

    public static void main(String[] args) {

        List<String> marketingStructureInFile = IOUtils.openFileList(PATH);

        IComposite estruturaMarketing = new EstruturaMarketing();
        try {
            marketingStructureInFile.forEach(ms -> {
                String[] word = ms.split(",");
                int codDepartamento = Integer.parseInt(word[0]);
                String desDepartamento = replaceSpecialChars(word[1]);
                int codSetor = Integer.parseInt(word[2]);
                String desSetor = replaceSpecialChars(word[3]);
                int codGrupo = Integer.parseInt(word[4]);
                String desGrupo = replaceSpecialChars(word[5]);
                int codCategoria = Integer.parseInt(word[6]);
                String desCategoria = replaceSpecialChars(word[7]);

                IComposite categoria = new Categoria(desCategoria, codCategoria);

                IComposite grupo = new Grupo(desGrupo, codGrupo);
                grupo.add(categoria);

                IComposite setor = new Setor(desSetor, codSetor);
                setor.add(grupo);

                IComposite departamento = new Departamento(desDepartamento, codDepartamento);
                departamento.add(setor);

                estruturaMarketing.add(departamento);
            });
        } catch (Exception e) {
            System.out.println();
        }

        String json = convertPojoToJson(estruturaMarketing);
        System.out.println(json);
    }

    private static <T> String convertPojoToJson(final T clazz) {
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();
        return gson.toJson(clazz);
    }

    private static String replaceSpecialChars(String word) {
        return word.replaceAll("\\W", "");
    }

}
