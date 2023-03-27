public class Main2 {
    public static void main(String[] args) {
        Person person1 = new Person("Hanif", "Bekasi");
        Staff staf1 = new Staff("Sandy", "Solo", "SV_UGM", 6000000);
        Student student1 = new Student("Raihan", "Bantul", "TRPL", 2023, 6400000);

        System.out.println("Call all method 'Person'" );
        System.out.println(person1.getName());
        person1.setAddress("Solo");
        System.out.println(person1.getAddress());
        System.out.println(person1+ "\n");

        System.out.println("Call all method 'Staff'" );
        System.out.println(staf1.getName());
        staf1.setAddress("Jakarta");
        System.out.println(staf1.getAddress());
        staf1.setSchool("SMA 1");
        System.out.println(staf1.getSchool());
        staf1.setPay(4500000);
        System.out.println(staf1.getPay());
        System.out.println(staf1);

        System.out.println("Call all method 'Student'" );
        System.out.println(student1.getName());
        student1.setAddress("Tangerang");
        System.out.println(student1.getAddress());
        student1.setProgram("TI");
        System.out.println(student1.getProgram());
        student1.setYear(2024);
        System.out.println(student1.getYear());
        student1.setFee(4500000);
        System.out.println(student1.getFee());
        System.out.println(student1);

        }
    }

