// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package htmltoxhtml.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import javax.swing.text.Document;
import org.jsoup.*;
import org.jsoup.select.Elements;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;

/**
 * For document templates xhtml is required, html might not always be parsed correctly. This java action parses html to xhtml. 
 * 
 * The returned string is the xhtml.
 */
public class JA_HTMLToXHTML extends CustomJavaAction<java.lang.String>
{
	private java.lang.String HTML;

	public JA_HTMLToXHTML(IContext context, java.lang.String HTML)
	{
		super(context);
		this.HTML = HTML;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		org.jsoup.nodes.Document document = Jsoup.parse(HTML);
		document.outputSettings().syntax(org.jsoup.nodes.Document.OutputSettings.Syntax.xml); 
	    	return document.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_HTMLToXHTML";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
