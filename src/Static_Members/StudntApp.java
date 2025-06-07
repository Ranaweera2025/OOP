package Static_Members;

public class StudntApp {
    public static void main(String[] args) {
        Student st=new Student("kamal",2410);
        Student st2=new Student("Nimal",2439);

        st.setbatch("Y1 S2 WD 2025");
        st.dispaly();
        st2.dispaly();

        System.out.println();

        System.out.println("Changing Batch-------------");

        st.setbatch("Y2 S1 WD 2025");
        st.dispaly();
        st2.dispaly();

    }
}
