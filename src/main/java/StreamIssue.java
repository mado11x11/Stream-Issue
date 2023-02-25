import java.util.List;
public class StreamIssue {

    public static void main(String[] args) {
        List<String> names = List.of("3user", "2user", "1user");

        // filter・toListの例文
        List<String> resulFilter = names.stream()
                .filter(name -> name.contains("2"))
                .toList();
        System.out.println("resultFilter : " + resulFilter);

        // sortedの例文
        List<String> resultSored = names.stream().
                sorted().
                toList();
        System.out.println("resultSored : " + resultSored);

        //　countの例文
        Long nameCnt = names.stream()
                .filter(name -> name.startsWith("2"))
                .count();
        System.out.println("nameCnt : " + nameCnt);

        // anyMatchの例文
        Boolean nameHas = names.stream()
                .anyMatch(name -> name.equals("2user"));
        System.out.println("nameHas : " + nameHas);

        // メソッド参照の例
        /**
         * メソッド参照を使用していない場合
         * names.stream().map(name -> name.toUpperCase())
         .forEach(name -> System.out.println("Name : " + name));
         */
        names.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }
}