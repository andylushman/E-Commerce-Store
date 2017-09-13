// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailtemplate.proxies;

public class EmailLog
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject emailLogMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmailTemplate.EmailLog";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Created("Created"),
		Logtype("Logtype"),
		Message("Message"),
		ErrorMessage("ErrorMessage"),
		TriggeredInMF("TriggeredInMF"),
		StackTrace("StackTrace");

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

	public EmailLog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EmailTemplate.EmailLog"));
	}

	protected EmailLog(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject emailLogMendixObject)
	{
		if (emailLogMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EmailTemplate.EmailLog", emailLogMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EmailTemplate.EmailLog");

		this.emailLogMendixObject = emailLogMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'EmailLog.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static emailtemplate.proxies.EmailLog initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emailtemplate.proxies.EmailLog.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emailtemplate.proxies.EmailLog initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emailtemplate.proxies.EmailLog(context, mendixObject);
	}

	public static emailtemplate.proxies.EmailLog load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emailtemplate.proxies.EmailLog.initialize(context, mendixObject);
	}

	public static java.util.List<emailtemplate.proxies.EmailLog> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<emailtemplate.proxies.EmailLog> result = new java.util.ArrayList<emailtemplate.proxies.EmailLog>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//EmailTemplate.EmailLog" + xpathConstraint))
			result.add(emailtemplate.proxies.EmailLog.initialize(context, obj));
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
	 * @return value of Created
	 */
	public final java.util.Date getCreated()
	{
		return getCreated(getContext());
	}

	/**
	 * @param context
	 * @return value of Created
	 */
	public final java.util.Date getCreated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Created.toString());
	}

	/**
	 * Set value of Created
	 * @param created
	 */
	public final void setCreated(java.util.Date created)
	{
		setCreated(getContext(), created);
	}

	/**
	 * Set value of Created
	 * @param context
	 * @param created
	 */
	public final void setCreated(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date created)
	{
		getMendixObject().setValue(context, MemberNames.Created.toString(), created);
	}

	/**
	 * Set value of Logtype
	 * @param logtype
	 */
	public final emailtemplate.proxies.LogType getLogtype()
	{
		return getLogtype(getContext());
	}

	/**
	 * @param context
	 * @return value of Logtype
	 */
	public final emailtemplate.proxies.LogType getLogtype(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Logtype.toString());
		if (obj == null)
			return null;

		return emailtemplate.proxies.LogType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Logtype
	 * @param logtype
	 */
	public final void setLogtype(emailtemplate.proxies.LogType logtype)
	{
		setLogtype(getContext(), logtype);
	}

	/**
	 * Set value of Logtype
	 * @param context
	 * @param logtype
	 */
	public final void setLogtype(com.mendix.systemwideinterfaces.core.IContext context, emailtemplate.proxies.LogType logtype)
	{
		if (logtype != null)
			getMendixObject().setValue(context, MemberNames.Logtype.toString(), logtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.Logtype.toString(), null);
	}

	/**
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of ErrorMessage
	 */
	public final java.lang.String getErrorMessage()
	{
		return getErrorMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of ErrorMessage
	 */
	public final java.lang.String getErrorMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ErrorMessage.toString());
	}

	/**
	 * Set value of ErrorMessage
	 * @param errormessage
	 */
	public final void setErrorMessage(java.lang.String errormessage)
	{
		setErrorMessage(getContext(), errormessage);
	}

	/**
	 * Set value of ErrorMessage
	 * @param context
	 * @param errormessage
	 */
	public final void setErrorMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String errormessage)
	{
		getMendixObject().setValue(context, MemberNames.ErrorMessage.toString(), errormessage);
	}

	/**
	 * @return value of TriggeredInMF
	 */
	public final java.lang.String getTriggeredInMF()
	{
		return getTriggeredInMF(getContext());
	}

	/**
	 * @param context
	 * @return value of TriggeredInMF
	 */
	public final java.lang.String getTriggeredInMF(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TriggeredInMF.toString());
	}

	/**
	 * Set value of TriggeredInMF
	 * @param triggeredinmf
	 */
	public final void setTriggeredInMF(java.lang.String triggeredinmf)
	{
		setTriggeredInMF(getContext(), triggeredinmf);
	}

	/**
	 * Set value of TriggeredInMF
	 * @param context
	 * @param triggeredinmf
	 */
	public final void setTriggeredInMF(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String triggeredinmf)
	{
		getMendixObject().setValue(context, MemberNames.TriggeredInMF.toString(), triggeredinmf);
	}

	/**
	 * @return value of StackTrace
	 */
	public final java.lang.String getStackTrace()
	{
		return getStackTrace(getContext());
	}

	/**
	 * @param context
	 * @return value of StackTrace
	 */
	public final java.lang.String getStackTrace(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StackTrace.toString());
	}

	/**
	 * Set value of StackTrace
	 * @param stacktrace
	 */
	public final void setStackTrace(java.lang.String stacktrace)
	{
		setStackTrace(getContext(), stacktrace);
	}

	/**
	 * Set value of StackTrace
	 * @param context
	 * @param stacktrace
	 */
	public final void setStackTrace(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String stacktrace)
	{
		getMendixObject().setValue(context, MemberNames.StackTrace.toString(), stacktrace);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return emailLogMendixObject;
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
			final emailtemplate.proxies.EmailLog that = (emailtemplate.proxies.EmailLog) obj;
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
		return "EmailTemplate.EmailLog";
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
