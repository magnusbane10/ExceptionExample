package exampleGenericInterface;

public class Procesor implements Comparable<Procesor> {
    private int freq;

    public Procesor(int freq) {
        this.freq = freq;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public int compareTo(Procesor otherProcesor) {
        return this.freq - otherProcesor.freq;
    }
}
