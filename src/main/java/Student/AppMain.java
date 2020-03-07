package Student;

import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {
        Dziennik d = new Dziennik();
        d.dodajStudenta(new Student("123", "a", "aa"));
        d.dodajStudenta(new Student("234", "b", "bb"));
        d.dodajStudenta(new Student("345", "c", "cc"));
        d.dodajStudenta(new Student("456", "d", "dd"));

        d.usunStudenta("123");
        Optional<Student> pudelko = d.zwrocStudenta("123");
        if (pudelko.isPresent()){
            Student s = pudelko.get();
            System.out.println(s.getImieStudenta());
        }
        d.posortujStudentow().forEach(System.out::println);
    }
}

