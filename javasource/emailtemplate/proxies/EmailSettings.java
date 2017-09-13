// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailtemplate.proxies;

public class EmailSettings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject emailSettingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmailTemplate.EmailSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UserName("UserName"),
		Password("Password"),
		Server("Server"),
		Port("Port"),
		FromAddress("FromAddress"),
		UseSSL("UseSSL"),
		UseTLS("UseTLS"),
		MaxAttempts("MaxAttempts");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public EmailSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EmailTemplate.EmailSettings"));
	}

	protected EmailSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject emailSettingsMendixObject)
	{
		if (emailSettingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EmailTemplate.EmailSettings", emailSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EmailTemplate.EmailSettings");

		this.emailSettingsMendixObject = emailSettingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'EmailSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static emailtemplate.proxies.EmailSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emailtemplate.proxies.EmailSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emailtemplate.proxies.EmailSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emailtemplate.proxies.EmailSettings(context, mendixObject);
	}

	public static emailtemplate.proxies.EmailSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emailtemplate.proxies.EmailSettings.initialize(context, mendixObject);
	}

	public static java.util.List<emailtemplate.proxies.EmailSettings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<emailtemplate.proxies.EmailSettings> result = new java.util.ArrayList<emailtemplate.proxies.EmailSettings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//EmailTemplate.EmailSettings" + xpathConstraint))
			result.add(emailtemplate.proxies.EmailSettings.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of UserName
	 */
	public final java.lang.String getUserName()
	{
		return getUserName(getContext());
	}

	/**
	 * @param context
	 * @return value of UserName
	 */
	public final java.lang.String getUserName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UserName.toString());
	}

	/**
	 * Set value of UserName
	 * @param username
	 */
	public final void setUserName(java.lang.String username)
	{
		setUserName(getContext(), username);
	}

	/**
	 * Set value of UserName
	 * @param context
	 * @param username
	 */
	public final void setUserName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String username)
	{
		getMendixObject().setValue(context, MemberNames.UserName.toString(), username);
	}

	/**
	 * @return value of Password
	 */
	public final java.lang.String getPassword()
	{
		return getPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of Password
	 */
	public final java.lang.String getPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Password.toString());
	}

	/**
	 * Set value of Password
	 * @param password
	 */
	public final void setPassword(java.lang.String password)
	{
		setPassword(getContext(), password);
	}

	/**
	 * Set value of Password
	 * @param context
	 * @param password
	 */
	public final void setPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String password)
	{
		getMendixObject().setValue(context, MemberNames.Password.toString(), password);
	}

	/**
	 * @return value of Server
	 */
	public final java.lang.String getServer()
	{
		return getServer(getContext());
	}

	/**
	 * @param context
	 * @return value of Server
	 */
	public final java.lang.String getServer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Server.toString());
	}

	/**
	 * Set value of Server
	 * @param server
	 */
	public final void setServer(java.lang.String server)
	{
		setServer(getContext(), server);
	}

	/**
	 * Set value of Server
	 * @param context
	 * @param server
	 */
	public final void setServer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String server)
	{
		getMendixObject().setValue(context, MemberNames.Server.toString(), server);
	}

	/**
	 * @return value of Port
	 */
	public final java.lang.Integer getPort()
	{
		return getPort(getContext());
	}

	/**
	 * @param context
	 * @return value of Port
	 */
	public final java.lang.Integer getPort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Port.toString());
	}

	/**
	 * Set value of Port
	 * @param port
	 */
	public final void setPort(java.lang.Integer port)
	{
		setPort(getContext(), port);
	}

	/**
	 * Set value of Port
	 * @param context
	 * @param port
	 */
	public final void setPort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer port)
	{
		getMendixObject().setValue(context, MemberNames.Port.toString(), port);
	}

	/**
	 * @return value of FromAddress
	 */
	public final java.lang.String getFromAddress()
	{
		return getFromAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of FromAddress
	 */
	public final java.lang.String getFromAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FromAddress.toString());
	}

	/**
	 * Set value of FromAddress
	 * @param fromaddress
	 */
	public final void setFromAddress(java.lang.String fromaddress)
	{
		setFromAddress(getContext(), fromaddress);
	}

	/**
	 * Set value of FromAddress
	 * @param context
	 * @param fromaddress
	 */
	public final void setFromAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fromaddress)
	{
		getMendixObject().setValue(context, MemberNames.FromAddress.toString(), fromaddress);
	}

	/**
	 * @return value of UseSSL
	 */
	public final java.lang.Boolean getUseSSL()
	{
		return getUseSSL(getContext());
	}

	/**
	 * @param context
	 * @return value of UseSSL
	 */
	public final java.lang.Boolean getUseSSL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseSSL.toString());
	}

	/**
	 * Set value of UseSSL
	 * @param usessl
	 */
	public final void setUseSSL(java.lang.Boolean usessl)
	{
		setUseSSL(getContext(), usessl);
	}

	/**
	 * Set value of UseSSL
	 * @param context
	 * @param usessl
	 */
	public final void setUseSSL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usessl)
	{
		getMendixObject().setValue(context, MemberNames.UseSSL.toString(), usessl);
	}

	/**
	 * @return value of UseTLS
	 */
	public final java.lang.Boolean getUseTLS()
	{
		return getUseTLS(getContext());
	}

	/**
	 * @param context
	 * @return value of UseTLS
	 */
	public final java.lang.Boolean getUseTLS(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseTLS.toString());
	}

	/**
	 * Set value of UseTLS
	 * @param usetls
	 */
	public final void setUseTLS(java.lang.Boolean usetls)
	{
		setUseTLS(getContext(), usetls);
	}

	/**
	 * Set value of UseTLS
	 * @param context
	 * @param usetls
	 */
	public final void setUseTLS(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usetls)
	{
		getMendixObject().setValue(context, MemberNames.UseTLS.toString(), usetls);
	}

	/**
	 * @return value of MaxAttempts
	 */
	public final java.lang.Integer getMaxAttempts()
	{
		return getMaxAttempts(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxAttempts
	 */
	public final java.lang.Integer getMaxAttempts(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaxAttempts.toString());
	}

	/**
	 * Set value of MaxAttempts
	 * @param maxattempts
	 */
	public final void setMaxAttempts(java.lang.Integer maxattempts)
	{
		setMaxAttempts(getContext(), maxattempts);
	}

	/**
	 * Set value of MaxAttempts
	 * @param context
	 * @param maxattempts
	 */
	public final void setMaxAttempts(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maxattempts)
	{
		getMendixObject().setValue(context, MemberNames.MaxAttempts.toString(), maxattempts);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return emailSettingsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final emailtemplate.proxies.EmailSettings that = (emailtemplate.proxies.EmailSettings) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "EmailTemplate.EmailSettings";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
