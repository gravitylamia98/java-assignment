package String_manipulation;

public class image_in_array {
    public static void main(String[] args) {
        String[] arr = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].split("\\.")[1].equals("jpg")||arr[i].split("\\.")[1].equals("png")){
                count++;
            }
        }
        System.out.println("There are "+count+" images");
    }
}
