public class Pilha {
        private int[] dados;
        private int topo;

        public Pilha(int max) {
            this.dados = new int[max];
            this.topo = 0;
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
                return -1;
            }
        }

        public boolean isEmpty() {
            return this.topo == 0;
        }

}
