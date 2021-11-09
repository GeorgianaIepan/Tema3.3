package repository;

import org.junit.jupiter.api.Test;
import classe.Kurs;
import classe.Lehrer;
import classe.Student;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LehrerRepositoryTest {

    ArrayList<Lehrer> lehrerList = null;
    ArrayList<Student> studentList = null;
    ArrayList<Kurs> kursList = null;

    private final LehrerRepository lehrerRepository = new LehrerRepository();
    private final StudentRepository studentRepository = new StudentRepository();
    private final KursRepository kursRepository = new KursRepository();

    private final Lehrer lehrer = new Lehrer("Ana", "Popescu", kursList);
    private final Student student = new Student("Georgiana", "Iepan", 125, 30, kursList);
    private final Kurs kurs = new Kurs("MAP", lehrer, 150, studentList, 6);

    @Test
    void update() {
        assertEquals(lehrer, lehrerRepository.update(lehrer));
    }
}