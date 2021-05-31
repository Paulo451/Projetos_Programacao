public class pilha {
    private int[] dados;
    private int topo;

    public pilha(int max) {
        this.dados = new int[max];
        this.topo = 0;
    }

    public int size() {
        return this.topo;
    }

    public void push(int elem) {
        if (this.dados.length > this.topo) {
            this.dados[this.topo] = elem;
            ++this.topo;
        }

    }

    public int pop() {
        if (this.topo > 0) {
            --this.topo;
            return this.dados[this.topo];
        } else {
            System.out.println("Pilha vazia!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return this.topo == 0;
    }

    public boolean isFull() {
        return this.topo == this.dados.length;
    }

    public int top() {
        if (this.topo > 0) {
            return this.dados[this.topo - 1];
        } else {
            System.out.println("Pilha vazia");
            return -1;
        }
    }

    public void reset() {
        this.topo = 0;
    }

}
