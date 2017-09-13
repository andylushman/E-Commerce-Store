// This file was generated by Mendix Modeler 7.5.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Main module
	public static void aCO_ADE_SetTotalProductStock(IContext context, main.proxies.Stock _stock)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Stock", _stock == null ? null : _stock.getMendixObject());
			Core.execute(context, "Main.ACO_ADE_SetTotalProductStock", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_Account_New(IContext context, main.proxies.Customer _customer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Customer", _customer == null ? null : _customer.getMendixObject());
			Core.execute(context, "Main.ACT_Account_New", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static main.proxies.Product aCT_ImageforCarousel(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "Main.ACT_ImageforCarousel", params);
			return result == null ? null : main.proxies.Product.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void callOrderShippedEmail(IContext context, main.proxies.Order _order)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Order", _order == null ? null : _order.getMendixObject());
			Core.execute(context, "Main.CallOrderShippedEmail", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void cO_CustomerProfile(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Main.CO_CustomerProfile", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void cO_NewRegistration(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Main.CO_NewRegistration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void openOrderPage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Main.OpenOrderPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sUB_ValadateUserFields(IContext context, main.proxies.Customer _customer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Customer", _customer == null ? null : _customer.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "Main.SUB_ValadateUserFields", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}