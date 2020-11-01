package lab7.Homework;

abstract class BaseLayer implements Layer {
    Layer next_layer;

    public void addLayer(Layer newLayer){
        next_layer = newLayer;
    }
}
