package pq2;

public interface Lista {

	void putInicio(Objeto obj);
    void putFinal(Objeto obj);
    Object popPrincipio();
    Object popFinal();
    Object getAt(int i); 
    int count();
}
