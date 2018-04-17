package composite;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {

    static final String PATH = "/home/fabiano/Developer/workspace/jobs/2018/201804/20180404/";
    static final String FILE_INPUT = "data-marketing-structure.csv";
    static final String FILE_DEPARTAMENTOS = "data-departamentos.json";
    static final String FILE_GRUPOS = "data-grupos.json";
    static final String FILE_SETORES = "data-setores.json";
    static final String FILE_CATEGORIAS = "data-categorias.json";

    public static void main(String[] args) {

        List<String> marketingStructureInFile = IOUtils.openFileList(PATH + FILE_INPUT);

        Map<Integer, Estrutura> departamentosMap = new HashMap<>();
        Map<Integer, Map<Integer, Estrutura>> setoresMap = new HashMap<>();
        Map<Integer, Map<Integer, Estrutura>> gruposMap = new HashMap<>();
        Map<Integer, Map<Integer, Estrutura>> categoriasMap = new HashMap<>();

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

                Estrutura departamento = new Estrutura(desDepartamento, codDepartamento);
                if (departamentosMap.get(codDepartamento) == null)
                    departamentosMap.put(codDepartamento, departamento);

                Estrutura setor = new Estrutura(desSetor, codSetor);
                if (setoresMap.get(codDepartamento) == null) {
                    Map map = new HashMap<>();
                    map.put(codSetor, setor);
                    setoresMap.put(codDepartamento, map);
                } else {
//                    setoresMap.get(codDepartamento).add(setor);
                }

//                Estrutura categoria = new Estrutura(desCategoria, codCategoria);
//                if (categoriasMap.get(codCategoria) == null) {
//                    List list = new ArrayList<Estrutura>();
//                    list.add(categoria);
//                    categoriasMap.put(codCategoria, list);
//                } else {
//                    categoriasMap.get(codCategoria).add(categoria);
//                }
//

//
//                Estrutura grupo = new Estrutura(desGrupo, codGrupo);
//                if (gruposMap.get(codGrupo) == null) {
//                    List list = new ArrayList<Estrutura>();
//                    list.add(grupo);
//                    gruposMap.put(codGrupo, list);
//                } else {
//                    gruposMap.get(codGrupo).add(grupo);
//                }

            });
        } catch (Exception e) {
            System.out.println();
        }

        List<Estrutura> departamentosList = new ArrayList<>();
        departamentosMap.entrySet().forEach(x -> {
            departamentosList.add(x.getValue());
        });

        createJson(departamentosList, FILE_DEPARTAMENTOS);
        createJson(setoresMap, FILE_SETORES);
//        createJson(gruposMap, FILE_GRUPOS);
//        createJson(categoriasMap, FILE_CATEGORIAS);
    }

    private static void createJson(Object map, String filename) {
        try {
            String json = convertMapToString(map);
            System.out.println(json);
            IOUtils.getInstance().createFile(PATH, filename, json, true);
        } catch (Exception e) {
            System.out.println("Cagou!!!");
        }
    }

    private static <T> String convertMapToString(final T clazz) {
        Gson gson = new Gson();
        return gson.toJson(clazz);
    }

    private static String replaceSpecialChars(String word) {
        return word.replaceAll("\\W", "");
    }

}