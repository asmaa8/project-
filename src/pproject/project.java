package pproject;


	import com.sun.prism.paint.Color;

	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;

	import javafx.scene.layout.VBox;
	import javafx.scene.text.Font;
	import javafx.scene.layout.StackPane;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler; 
	public class  project extends Application {
	 // Override the start method in the Application class
	TextField t1 = new TextField();
	double number1;
	double number2;
	String operation;
	private String asd;
	@Override
	public void start(Stage primaryStage) {
	   GridPane pane = new GridPane();
	   pane.setAlignment(Pos.CENTER);
	   pane.setPadding(new Insets(0, 5, 0, 5));
	   pane.setHgap(5);
	   pane.setVgap(5);
	 pane.setStyle("-fx-background-color:lightgray;-fx-border-width:5;");
	   StackPane pan = new StackPane();
	   pan.setPadding(new Insets(5, 5, 5, 5));

	   t1.setMinSize(250,150);
	   pan.getChildren().add(t1); 
	 
	   Button b1=new Button("7");
	  b1.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b1.setMinSize(40,40);
	   b1.setOnAction(new EventHandler<ActionEvent>() {      
	    @Override
	   public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b1, 0 , 0);
	   
	   
	   Button b2=new Button("8");
	   b2.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b2.setMinSize(40,40);
	   b2.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b2, 1 , 0);
	   
	   
	   Button b3=new Button("9");
	   b3.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b3.setMinSize(40,40);
	   b3.setOnAction(new EventHandler<ActionEvent>() {
		   String  s="";
	    @Override
	public void handle(ActionEvent e) {
	    	
	  s  += b3.getText();
	t1.setText(s);
	}
	});
	   pane.add(b3, 2 , 0);
	   
	   
	   Button b4=new Button("/");
	   b4.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b4.setMinSize(40,40);
	   b4.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	  divie();
	}
	});
	   pane.add(b4, 3 , 0);
	   
	   
	   Button b5=new Button("AC");
	   b5.setStyle("-fx-background-color:lightblue;-fx-border-radius:70;");
	   b5.setMinSize(40,40);
	   b5.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    	String s = t1.getText();
	        t1.setText(s.substring(0, s.length()-1));
	}
	});
	   pane.add(b5, 4 , 0);
	   
	   
	   Button b6=new Button("Del");
	   b6.setStyle("-fx-background-color:lightblue;-fx-border-radius:70;");
	   b6.setMinSize(40,40);
	   b6.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   t1.setText("");
	}
	});   
	   pane.add(b6, 5 , 0);
	   
	   
	   Button b24=new Button("x^3");
	   b24.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b24.setMinSize(40,40);
	   b24.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    tribble();
	}
	});
	   pane.add(b24, 6 , 0);
	   
	   
	   Button b28=new Button("sin");
	   b28.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b28.setMinSize(40,40);
	   b28.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    	sin();
	}
	});
	   pane.add(b28, 7 , 0);
	   
	   
	   Button b32=new Button("sinh");
	   b32.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b32.setMinSize(40,40);
	   b32.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    	sinh();
	}
	});
	   pane.add(b32, 8 , 0);
	   
	   
	   Button b7=new Button("4");
	   b7.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b7.setMinSize(40,40);
	   b7.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b7, 0 , 1);
	   
	   
	   Button b8=new Button("5");
	   b8.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b8.setMinSize(40,40);
	   b8.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b8, 1 , 1);
	   
	   
	   Button b9=new Button("6");
	   b9.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b9.setMinSize(40,40);
	   b9.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b9, 2 , 1);
	   
	   
	   Button b10=new Button("×");
	   b10.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b10.setMinSize(40,40);
	   b10.setOnAction(new EventHandler<ActionEvent>() {
		   String s="";
	    @Override
	public void handle(ActionEvent e) {
	   multiply();
	 s += b10.getText();
	 t1.setText(s);
	}
	});
	   pane.add(b10, 3 , 1);
	   
	   
	   Button b11=new Button("(");
	   b11.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b11.setMinSize(40,40);
	   b11.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b11, 4 , 1);
	   
	   
	   Button b12=new Button(")");
	   b12.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b12.setMinSize(40,40);
	   b12.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b12, 5 , 1);
	   
	   
	   Button b25=new Button("pi");
	   b25.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b25.setMinSize(40,40);
	   b25.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    t1.setText("3.142857142857143");
	   
	}
	});
	   pane.add(b25, 6 , 1);
	   
	   
	   Button b29=new Button("cos");
	   b29.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b29.setMinSize(40,40);
	   b29.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   cos();
	}
	});
	   pane.add(b29, 7 , 1);
	   
	   
	   Button b33=new Button("cosh");
	   b33.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b33.setMinSize(40,40);
	   b33.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    cosh();
	}
	});
	   pane.add(b33, 8 , 1);
	   
	   
	   Button b13=new Button("1");
	   b13.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b13.setMinSize(40,40);
	   b13.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b13, 0 , 2);
	   
	   
	   Button b14=new Button("2");
	   b14.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b14.setMinSize(40,40);
	   b14.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b14, 1 , 2);
	   
	   
	   Button b15=new Button("3");
	   b15.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b15.setMinSize(40,40);
	   b15.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b15, 2 , 2);
	   
	   
	   Button b16=new Button("-");
	   b16.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b16.setMinSize(40,40);
	   b16.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   subtract();
	}
	});
	   pane.add(b16, 3 , 2);
	   
	   
	   Button b17=new Button("x^2");
	   b17.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b17.setMinSize(40,40);
	   b17.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   pow();
	}
	});
	   pane.add(b17, 4 , 2);
	   
	   
	   Button b18=new Button("sqrt");
	   b18.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b18.setMinSize(40,40);
	   b18.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   sqr();
	}
	});
	   pane.add(b18, 5 , 2);
	   
	   
	   Button b26=new Button("10^x");
	    b26.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b26.setMinSize(40,40);
	   b26.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   powN();
	}
	});
	   pane.add(b26, 6 , 2);
	   
	   
	   
	   Button b30=new Button("tan");
	   b30.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b30.setMinSize(40,40);
	   b30.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	  tan(); 
	}
	});
	   pane.add(b30, 7 , 2);
	   
	   
	   Button b34=new Button("tanh");
	   b34.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b34.setMinSize(40,40);
	   b34.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    	 tanh(); 
	} 
	});
	   pane.add(b34, 8 , 2);
	   
	   
	   Button b19=new Button("0");
	   b19.setStyle("-fx-background-color:white;-fx-border-radius:70;");
	   b19.setMinSize(40,40);
	   b19.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b19, 1 , 3);
	   
	   
	   Button b20=new Button(".");
	   b20.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b20.setMinSize(40,40);
	   b20.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   String s = ((Button)e.getSource()).getText();
	   t1.setText(t1.getText()+s);
	}
	});
	   pane.add(b20, 0 , 3);
	   
	   
	   Button b21=new Button("%");
	   b21.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b21.setMinSize(40,40);
	   b21.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   modul();
	}
	});
	   pane.add(b21, 2 , 3);
	   
	   
	   Button b22=new Button("+");
	   b22.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b22.setMinSize(40,40);
	   b22.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	   Add();
	}
	});
	   pane.add(b22, 3 , 3);
	   
	   
	   Button b31=new Button(" log "); 
	   b31.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b31.setMinSize(40,40);
	   b31.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    	log();
	}
	});
	   pane.add(b31, 5 , 3);
	   
	   
	   Button b35=new Button("  ln  ");
	    b35.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b35.setMinSize(40,40);
	   b35.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    	ln();
	}
	});
	   pane.add(b35, 6 , 3); 
	   
	   Button b27=new Button(" 1/x ");
	   b27.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b27.setMinSize(40,40);
	   b27.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    	div();
	}
	});
	   pane.add(b27, 4 , 3);
	   
	   Button b36=new Button("e");
	   b36.setStyle("-fx-background-color:pink;-fx-border-radius:70;");
	   b36.setMinSize(40,40);
	   b36.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	    	t1.setText("2.71828183");
	    }
	    
	});
	   pane.add(b36, 7 , 3);
	   
	   Button b23=new Button("=");
	   b23.setStyle("-fx-background-color:lightblue;-fx-border-radius:70;");
	   b23.setMinSize(40,40);
	   b23.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	public void handle(ActionEvent e) {
	  if(operation == "x^2" || operation == "sqrt" || operation == "%" || operation== "x^3"
	          || operation == "sin" || operation == "cos" || operation == "tan"
	          || operation == "sinh" || operation == "cosh" || operation == "tanh"
	          || operation == "log" || operation == "ln" || operation == "10^x"
	          || operation == "1/x ")
		  //if(operation=="sqrt"&& (number1<0||number1==0))
			//  t1.setText("Error you should enter positive num");
		  //else
		  if(operation == "1/x " && number1 == 0 )
	          t1.setText("Cannot divide by zero");
	   else if (operation == "sqrt" && (number1<0||number1==0))
	  	    t1.setText("Error you should enter positive num");
	   else
	      equi1();
	  
	  else
	      equi2();
	}
	});
	   pane.add(b23, 8 , 3);
	   
	   
	   t1.prefHeightProperty().bind(pane.heightProperty().divide(1));
	   b1.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b2.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b3.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b4.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b5.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b6.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b7.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b8.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b9.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b10.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   
	   b11.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b12.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b13.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b14.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b15.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b16.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b17.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b18.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b19.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b20.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   
	   b21.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b22.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b23.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b24.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b25.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b26.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b27.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b28.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b29.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b30.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   
	   b31.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b32.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b33.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b34.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b35.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   b36.prefHeightProperty().bind(pane.heightProperty().divide(3));
	   
	   b1.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b2.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b3.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b4.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b5.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b6.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b7.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b8.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b9.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b10.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   
	   b11.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b12.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b13.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b14.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b15.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b16.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b17.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b18.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b19.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b20.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   
	   b21.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b22.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b35.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b24.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b25.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b26.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b27.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b28.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b29.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b30.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   
	   b31.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b32.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b33.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b34.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b23.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   b36.prefWidthProperty().bind(pane.widthProperty().divide(6));
	   
	   VBox vBox = new VBox(5);
	   vBox.getChildren().addAll(pan,pane); 
	   vBox.setStyle("-fx-background-color:lightgray");
	   Scene scene = new Scene(vBox);
	   primaryStage.setTitle("ShowGridPane");
	   primaryStage.setScene(scene);
	   primaryStage.show();
	}
	public static void main(String[] args) {

	    launch(args);
	}

	void Add()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="+";
	}
	void tan()
	{

	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="tan";
	}
	void subtract()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="-";
	}
	void divie()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="/";
	}
	void multiply()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="*";
	}
	void modul()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="%";
	}
	void sqr()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="sqrt";
	}
	void pow()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="x^2";
	}
	void tribble(){
		number1 = Double.parseDouble(t1.getText());
		t1.setText("");
		operation="x^3";
	}
	void sin(){
		number1 = Double.parseDouble(t1.getText());
		t1.setText("");
		operation="sin";
	}
	void sinh(){
		number1 = Double.parseDouble(t1.getText());
		t1.setText("");
		operation="sinh";
	}



	void cosh(){
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="cosh";
	}

	/**
	 * 
	 * create 
	 */
	void powN()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="10^x";
	};
	void cos()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="cos";
	};
	void ln()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="ln";
	};
	void log()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="log";
	};
	void tanh()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="tanh";
	};
	void div()
	{
	number1 = Double.parseDouble(t1.getText());
	t1.setText("");
	operation="1/x";
	};


	void equi1()
	{
	String s;
	double result = 0;
	if(operation == "1/x " && number1 == 0)
	    t1.setText("Cannot divide by zero");
	else
	{
	switch(operation)
	{
	    case "x^2":
	         result = number1 * number1;
	        break;
	    case "sqrt":
	         result = Math.sqrt( number1 );
	        break;
	    case "%": 
	         result = number1 / 100 ;
	        break;
	   case "tan":
	        result = Math.tan(Math.toRadians(number1)); 
	        break;      
	   case "x^3":
	       result = number1 * number1 * number1;
	       break;
	   case "sin":
	       result = Math.sin(Math.toRadians(number1));
	       break;
	   case "cos":
	       result = Math.cos(Math.toRadians(number1));
	       break;
	   case "sinh":
	       result = Math.sinh(number1); //Math.sinh(Math.toRadians(number1));
	       break;
	   case "cosh":
	       result = Math.cosh(number1);
	       break;
	   case "tanh":
	       result = Math.tanh(number1);
	       break;
	   case "10^x":
	       result = Math.pow(10,number1);
	       break;
	   case "log":
	       result = Math.log(number1);
	       break;
	   case "ln":
	       result = 1/Math.log(number1);
	       break;
	   case "1/x":
		   break;
	}
	s = Double.toString(result);
	t1.setText(s);
	}
	}

	void equi2()
	{
	String s;
	number2 = Double.parseDouble(t1.getText());
	double result = 0;
	if(operation == "/" && number2 == 0)
	    t1.setText("Cannot divide by zero");
	else
	{
	switch(operation)
	{
	    case "+":
	        result = number1 + number2;
	        break;
	    case "-":
	        result = number1 - number2;
	        break;
	    case "*":
	        result = number1 * number2;
	        break;
	    case "/":
	        result = number1 / number2; 
	        break;   
	}
	s = Double.toString(result);
	t1.setText(s);}
	}
	}