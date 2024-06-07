public class Runner {
    public static void main(String[] args) {
        CustomArrayList<String> stringArrayList = new MyArrayList<String>();
        stringArrayList.add("first");
        stringArrayList.update(0,"second");
        System.out.println(stringArrayList.get(0));
        stringArrayList.remove(0);
        stringArrayList.add("first");

        for (String s : stringArrayList) {
            System.out.printf("My array List: %s", s);
        }

    }
}
