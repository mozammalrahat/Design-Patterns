public class DecoratorPatternWindow {
    public static void main(String[] args) {
        Window decorateWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        System.out.println(decorateWindow.getDescription());
    }
}
