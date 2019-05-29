public class Deleteword {
    public static void main(String[] args) {
        String text = "my friend go to the cinema tomorrow. I study in KPI. My sisters favourite singer is Vinnyk.";
        String[] sentences = text.split("[\\.\\!\\?]");
        for (int i=0; i<sentences.length; i++){
            int start = sentences[i].indexOf('f');
            int end = sentences[i].lastIndexOf('e') + 1;
            if (start == -1 || end == -1){
                System.out.println("Number of sentance: " + (i+1) + " ---> " + sentences[i]);
                System.out.println("Нема що вирізати ");
                System.out.println("Оброблене речення: " + sentences[i]);
                System.out.println("-------------------");
            }
            else if (end < start){
                System.out.println("Number of sentance: " + (i+1) + " ---> " + sentences[i]);
                System.out.println("Нема кінцевого значення");
                System.out.println("Оброблене речення: " + sentences[i]);
                System.out.println("-------------------");
            }
            else {
                System.out.println("Number of sentance: " + (i+1) + " ---> " + sentences[i]);
                System.out.println("Вирізано: " + sentences[i].substring(start, end));
                System.out.println("Оброблене речення: " +sentences[i].substring(0, start) + sentences[i].substring(end, sentences[i].length()));
                System.out.println("-------------------");
            }
        }
    }
}