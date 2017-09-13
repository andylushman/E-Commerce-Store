// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package emailtemplate.actions;

import java.util.Map;
import java.util.Map.Entry;
import mxmodelreflection.TokenReplacer;
import com.mendix.core.objectmanagement.member.MendixString;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObjectMember;
import com.mendix.webui.CustomJavaAction;

public class ReplaceEmailTemplateTokens extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject DataObject;
	private IMendixObject __email;
	private emailtemplate.proxies.Email email;
	private java.util.List<IMendixObject> __TokenList;
	private java.util.List<mxmodelreflection.proxies.Token> TokenList;

	public ReplaceEmailTemplateTokens(IContext context, IMendixObject DataObject, IMendixObject email, java.util.List<IMendixObject> TokenList)
	{
		super(context);
		this.DataObject = DataObject;
		this.__email = email;
		this.__TokenList = TokenList;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.email = __email == null ? null : emailtemplate.proxies.Email.initialize(getContext(), __email);

		this.TokenList = new java.util.ArrayList<mxmodelreflection.proxies.Token>();
		if (__TokenList != null)
			for (IMendixObject __TokenListElement : __TokenList)
				this.TokenList.add(mxmodelreflection.proxies.Token.initialize(getContext(), __TokenListElement));

		// BEGIN USER CODE
		
		Map<String, ? extends IMendixObjectMember<?>> members = this.email.getMendixObject().getMembers(getContext());
		for( Entry<String, ? extends IMendixObjectMember<?>> entry : members.entrySet() ) {
			
			IMendixObjectMember<?> m = entry.getValue();
			if( m instanceof MendixString && m.hasWriteAccess(this.getContext())) {
				MendixString member = (MendixString) m;
				member.setValue( this.getContext(), TokenReplacer.replaceTokens(this.getContext(), member.getValue(this.getContext()), this.__TokenList, this.DataObject));
			}
		}

		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ReplaceEmailTemplateTokens";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
