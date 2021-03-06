// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cart.proxies;

public class ShoppingCart
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject shoppingCartMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Cart.ShoppingCart";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TotalCost("TotalCost"),
		CheckOutNotes("CheckOutNotes"),
		ShoppingCart_Customer("Cart.ShoppingCart_Customer"),
		ShoppingCart_Session("Cart.ShoppingCart_Session");

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

	public ShoppingCart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Cart.ShoppingCart"));
	}

	protected ShoppingCart(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject shoppingCartMendixObject)
	{
		if (shoppingCartMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Cart.ShoppingCart", shoppingCartMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Cart.ShoppingCart");

		this.shoppingCartMendixObject = shoppingCartMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ShoppingCart.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static cart.proxies.ShoppingCart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return cart.proxies.ShoppingCart.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static cart.proxies.ShoppingCart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new cart.proxies.ShoppingCart(context, mendixObject);
	}

	public static cart.proxies.ShoppingCart load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return cart.proxies.ShoppingCart.initialize(context, mendixObject);
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
	 * @return value of TotalCost
	 */
	public final java.math.BigDecimal getTotalCost()
	{
		return getTotalCost(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalCost
	 */
	public final java.math.BigDecimal getTotalCost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TotalCost.toString());
	}

	/**
	 * Set value of TotalCost
	 * @param totalcost
	 */
	public final void setTotalCost(java.math.BigDecimal totalcost)
	{
		setTotalCost(getContext(), totalcost);
	}

	/**
	 * Set value of TotalCost
	 * @param context
	 * @param totalcost
	 */
	public final void setTotalCost(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal totalcost)
	{
		getMendixObject().setValue(context, MemberNames.TotalCost.toString(), totalcost);
	}

	/**
	 * @return value of CheckOutNotes
	 */
	public final java.lang.String getCheckOutNotes()
	{
		return getCheckOutNotes(getContext());
	}

	/**
	 * @param context
	 * @return value of CheckOutNotes
	 */
	public final java.lang.String getCheckOutNotes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CheckOutNotes.toString());
	}

	/**
	 * Set value of CheckOutNotes
	 * @param checkoutnotes
	 */
	public final void setCheckOutNotes(java.lang.String checkoutnotes)
	{
		setCheckOutNotes(getContext(), checkoutnotes);
	}

	/**
	 * Set value of CheckOutNotes
	 * @param context
	 * @param checkoutnotes
	 */
	public final void setCheckOutNotes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String checkoutnotes)
	{
		getMendixObject().setValue(context, MemberNames.CheckOutNotes.toString(), checkoutnotes);
	}

	/**
	 * @return value of ShoppingCart_Customer
	 */
	public final main.proxies.Customer getShoppingCart_Customer() throws com.mendix.core.CoreException
	{
		return getShoppingCart_Customer(getContext());
	}

	/**
	 * @param context
	 * @return value of ShoppingCart_Customer
	 */
	public final main.proxies.Customer getShoppingCart_Customer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.Customer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ShoppingCart_Customer.toString());
		if (identifier != null)
			result = main.proxies.Customer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ShoppingCart_Customer
	 * @param shoppingcart_customer
	 */
	public final void setShoppingCart_Customer(main.proxies.Customer shoppingcart_customer)
	{
		setShoppingCart_Customer(getContext(), shoppingcart_customer);
	}

	/**
	 * Set value of ShoppingCart_Customer
	 * @param context
	 * @param shoppingcart_customer
	 */
	public final void setShoppingCart_Customer(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.Customer shoppingcart_customer)
	{
		if (shoppingcart_customer == null)
			getMendixObject().setValue(context, MemberNames.ShoppingCart_Customer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ShoppingCart_Customer.toString(), shoppingcart_customer.getMendixObject().getId());
	}

	/**
	 * @return value of ShoppingCart_Session
	 */
	public final system.proxies.Session getShoppingCart_Session() throws com.mendix.core.CoreException
	{
		return getShoppingCart_Session(getContext());
	}

	/**
	 * @param context
	 * @return value of ShoppingCart_Session
	 */
	public final system.proxies.Session getShoppingCart_Session(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Session result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ShoppingCart_Session.toString());
		if (identifier != null)
			result = system.proxies.Session.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ShoppingCart_Session
	 * @param shoppingcart_session
	 */
	public final void setShoppingCart_Session(system.proxies.Session shoppingcart_session)
	{
		setShoppingCart_Session(getContext(), shoppingcart_session);
	}

	/**
	 * Set value of ShoppingCart_Session
	 * @param context
	 * @param shoppingcart_session
	 */
	public final void setShoppingCart_Session(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Session shoppingcart_session)
	{
		if (shoppingcart_session == null)
			getMendixObject().setValue(context, MemberNames.ShoppingCart_Session.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ShoppingCart_Session.toString(), shoppingcart_session.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return shoppingCartMendixObject;
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
			final cart.proxies.ShoppingCart that = (cart.proxies.ShoppingCart) obj;
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
		return "Cart.ShoppingCart";
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
