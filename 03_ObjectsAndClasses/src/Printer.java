public class Printer {
    private String queue;
    private int pagesCount = 0;
    private int documentsCount = 0;
    private int totalCountPrint = 0;



    public static void main(String[] args) {
        Printer printout = new Printer();
        printout.append("Текст документа", "Ведомость", 4);
        System.out.println(printout.getDocumentsCount());
        System.out.println(printout.getPagesCount());
        printout.print("Printer");
        System.out.println(printout.getDocumentsCount());
        System.out.println(printout.getPagesCount());
        System.out.println(printout.totalCountPrint);
    }

    public void append(String textDoc, String nameDoc, int count) {
        queue = "Документы на печать" + "\n" + textDoc + " - " + nameDoc + " - " + count;
        pagesCount = pagesCount + count;
        documentsCount = documentsCount +1;

    }

    public void append(String textDoc, String nameDoc) {
        append(textDoc, nameDoc, 1 );
    }

    public void  append(String textDoc) {
        append(textDoc, "Document", 1);
    }

    public void clear() {
        queue = " ";
        pagesCount = 0;
        documentsCount = 0;
    }

    public int getTotalCountPrint() {
        return totalCountPrint;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getDocumentsCount() {
        return documentsCount;
    }


    public void print(String title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("нет документов на печать");
        } else {
            System.out.println(queue);
        }
        totalCountPrint = pagesCount + documentsCount;

        clear();
    }
}

