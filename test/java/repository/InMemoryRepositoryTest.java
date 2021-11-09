package repository;

import org.junit.jupiter.api.Test;
import classe.*;
import repository.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryRepositoryTest {

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
    void create() {
        assertEquals(lehrer, lehrerRepository.create(lehrer));
        assertEquals(student, studentRepository.create(student));
        assertEquals(kurs, kursRepository.create(kurs));
    }

    @Test
    void delete() {
        lehrerRepository.delete(lehrer);
        assertEquals(0, lehrerRepository.getAll().size());

        studentRepository.delete(student);
        assertEquals(0, studentRepository.getAll().size());

        kursRepository.delete(kurs);
        assertEquals(0, kursRepository.getAll().size());
    }

    @Test
    void getOne() {
        assertEquals(lehrer, lehrerRepository.getOne(0));
        assertEquals(student, studentRepository.getOne(0));
        assertEquals(kurs, kursRepository.getOne(0));
    }

    @Test
    void getAll() {
        assertEquals(1, lehrerRepository.getAll().size());
        assertEquals(1, studentRepository.getAll().size());
        assertEquals(1, kursRepository.getAll().size());
    }
}