class School {
    String school_name;

    // 'class' ki jagah 'displayClass' naam use kiya hai
    void displayClass() {
        System.out.println("Class");
    }

    void student() {
        System.out.println("Student");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        
        // Ab aap functions ko call kar sakti hain
        s1.displayClass(); // School class se inherit hua hai
        s1.student();      // School class se inherit hua hai
    }
}

class Roll extends School {
    int roll_no;
}

class Student extends Roll {
    String name;
}
