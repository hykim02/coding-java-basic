public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5];


        // 변수 값 대입
        students[0] = 90;
        students[1] = 70;
        students[2] = 30;
        students[3] = 40;
        students[4] = 50;

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
        System.out.println(students);
    }
}
