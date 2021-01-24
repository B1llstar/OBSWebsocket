package net.twasi.obsremotejava.objects;

public class Source {
    private String name;
    private double cx;
    private double cy;
    private boolean render;
    private int source_cx;
    private int source_cy;
    private String type;
    private double volume;
    private double x;
    private double y;
    //private List<Source> sources;

    public String getName() {
        return name;
    }

    public double getCX() { return cx; }
    public double getCY() { return cy; }

    public boolean isRender() {
        return render;
    }

    public int getSourceCX() { return source_cx; }
    public int getSourceCY() { return source_cy; }

    public String getType() { return type; }

    public double getVolume() { return volume; }

    public double getX() { return x; }
    public double getY() { return y; }

    /* public List<Source> getSources() {
        return sources;
    }*/
}
