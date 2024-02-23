package week3.day1assignment;

public class Elements extends Button {
	public static void main(String[] args) {
		Elements e=new Elements();
		CheckBoxButton cb=new CheckBoxButton();
		RadioButton rb=new RadioButton();
		TextField tf=new TextField();
		e.click();
		e.setText("Element class");
		e.submit();
		cb.click();
		cb.setText("CheckBoxButton");
		cb.clickCheckButton();
		cb.submit();
		rb.click();
		rb.setText("RadioButton");
		rb.selectRadioButton();
		rb.submit();
		tf.click();
		tf.setText("TextField");
		tf.getText();
		
		
	}

}
