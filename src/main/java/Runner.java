public class Runner {
    public static void main(String[] args) {
        CustomArrayList<String> stringArrayList = new MyArrayList<String>();
        stringArrayList.add("first");
        stringArrayList.update(0,"second");
        System.out.printf("Index 0: %s \n", stringArrayList.get(0));
        stringArrayList.remove(0);

        String[] strings = new String[]{"first", "second", "three"};
        stringArrayList.addAll(strings);
        stringArrayList.show();
        stringArrayList.update(0,"1");
        stringArrayList.show();


    }
}
