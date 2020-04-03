import static org.junit.Assert.*;

public class VectorHeapTest {

    @org.junit.Test
    public void getFirst() {
        System.out.println("getFirst");
        Paciente patient = new Paciente("Jose", "Rasguño", "A");
        VectorHeap instance = new VectorHeap();
        instance.add(patient);
        Object expResult = patient;
        Object result = instance.getFirst();
        assertEquals (expResult, result);
    }

    @org.junit.Test
    public void remove() {
        Paciente patient = new Paciente("Jose", "Rasguño", "A");
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        instance.add(patient);
        Object expResult = patient;
        Object result = instance.remove();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void add() {
        System.out.println("add");
        VectorHeap instance = new VectorHeap();
        instance.add(new Paciente("Jose", "Rasguño", "A"));
    }
}