package br.com.surungo.ponto;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	//private TextView textR;
	//private DatePicker dateP;
	//private TimePicker timeP;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//MySQLiteHelper db = new MySQLiteHelper(this);
		/**
         * CRUD Operations
         * */
        // add Books
        //db.addBook(new Book("Android Application Development Cookbook", "Wei Meng Lee"));   
        //db.addBook(new Book("Android Programming: The Big Nerd Ranch Guide", "Bill Phillips and Brian Hardy"));       
        //db.addBook(new Book("Learn Android App Development", "Wallace Jackson"));
 
        // get all books
        //List<Book> list = db.getAllBooks();
 
        // delete one book
        //db.deleteBook(list.get(0));
 
        // get all books
        //db.getAllBooks();
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		//textR = (TextView) findViewById(R.id.textView1);
		//dateP = (DatePicker) findViewById(R.id.datePicker1);
		//timeP = (TimePicker) findViewById(R.id.timePicker1);
		
		
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
			//	String texto = dateP.getDayOfMonth()+"/"+(dateP.getMonth()+1)+"/"+dateP.getYear()+
			//			" "+
			//			timeP.getCurrentHour()+":"+timeP.getCurrentMinute();
			//	textR.setText(texto);
				
				//MySQLiteHelper db = new MySQLiteHelper(view.getContext());
				
				//db.addBook(new Book("data", texto));
				
				//List<Book> list = db.getAllBooks();
				
				//for(Book book: list){
				//	texto+="_"+book.getAuthor();
				//}
				//textR.setText(texto);
				
				
				Toast.makeText(MainActivity.this, "Ponto Salvo",
						Toast.LENGTH_SHORT).show();
			}
		});

		return true;
	}*/
}
