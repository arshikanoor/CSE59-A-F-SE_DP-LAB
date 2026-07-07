interface OptimizableModel {
    void quantize();
}



class ResNet18 implements OptimizableModel {

    @Override
    public void quantize() {
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}



class MobileNet implements OptimizableModel {

    @Override
    public void quantize() {
        System.out.println("Applying dynamic quantization for MobileNet.");
    }
}



class InferenceEngine {

    public void optimizeModel(OptimizableModel model) {
        model.quantize();
    }
}



public class Main {

    public static void main(String[] args) {

        InferenceEngine engine = new InferenceEngine();

        OptimizableModel resnet = new ResNet18();
        engine.optimizeModel(resnet);


  
        OptimizableModel mobilenet = new MobileNet();
        engine.optimizeModel(mobilenet);
    }
}
