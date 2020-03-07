package Student;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

@NoArgsConstructor
@Data
@Getter
@Setter
public class Student {
    private List<Double> ocenyStudenta = new ArrayList<>();
    private String nrIndeksu;
    private String imieStudenta;
    private String nazwiskoStudenta;

    public Student(String nrIndeksu, String imieStudenta, String nazwiskoStudenta) {
        this.nrIndeksu = nrIndeksu;
        this.imieStudenta = imieStudenta;
        this.nazwiskoStudenta = nazwiskoStudenta;
    }
    public Double obliczSrednia (){
        double suma = 0.0;
        for (int i = 0; i< ocenyStudenta.size(); i++) { // metoda nr 1
            suma += ocenyStudenta.get(i);
        }
       // suma = ocenyStudenta.stream().mapToDouble(Double::doubleValue).sum(); // metoda nr 2
        OptionalDouble srednia = ocenyStudenta.stream().mapToDouble(Double::doubleValue).average();
        return srednia.orElse(0.0);
    }
}
