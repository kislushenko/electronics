/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.electronics.webservices.test.test.groovy.webservicetests.v2.spock

import de.hybris.bootstrap.annotations.IntegrationTest
import com.electronics.webservices.test.setup.TestSetupUtils
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.access.AccessRightsTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.access.OAuth2Test
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.address.AddressTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.apidocs.advices.ApiDocsAdviceTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.apidocs.services.ApiVendorExtensionServiceTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.basesites.BaseSitesTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.basestores.BaseStoresTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.carts.*
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.catalogs.CatalogsResourceTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.consents.ConsentResourcesTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.countries.CountryResourcesTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.customergroups.CustomerGroupsTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.errors.ErrorTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.export.ExportTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.filters.CartMatchingFilterTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.filters.UserMatchingFilterTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.flows.AddressBookFlow
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.flows.CartFlowTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.general.CacheTests
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.general.HeaderTests
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.general.StateTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.misc.*
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.orders.OrderReturnsTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.orders.OrdersTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.paymentdetails.PaymentsTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.paymentmodes.PaymentModesTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.products.ProductResourceTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.products.ProductsStockTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.promotions.PromotionsTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.stores.StoresTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.users.LoginNotificationTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.users.UserAccountTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.users.UserOrdersTest
import com.electronics.webservices.test.test.groovy.webservicetests.v2.spock.users.UsersResourceTest

import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.slf4j.LoggerFactory

@RunWith(Suite.class)
@Suite.SuiteClasses([
	AccessRightsTest, OAuth2Test, StateTest, CartDeliveryTest, CartMergeTest, CartEntriesTest, CartEntryGroupsTest, CartPromotionsTest,
	CartResourceTest, CartValidationTest, CartVouchersTest, GuestsTest, OrderPlacementTest, CatalogsResourceTest, CustomerGroupsTest, ErrorTest, ExportTest,
	AddressBookFlow, CartFlowTest, CardTypesTest, CurrenciesTest, DeliveryCountriesTest, LanguagesTest, LocalizationRequestTest, TitlesTest,
	OrdersTest, ProductResourceTest, ProductsStockTest, PromotionsTest, SavedCartTest, SavedCartFullScenarioTest, StoresTest, UserAccountTest,
	AddressTest, UserOrdersTest, PaymentsTest, PaymentModesTest, UsersResourceTest, CartMatchingFilterTest, UserMatchingFilterTest, HeaderTests,
	ConsentResourcesTest, CountryResourcesTest, BaseStoresTest, BaseSitesTest, OrderReturnsTest, LoginNotificationTest,
	CacheTests, ApiDocsAdviceTest, ApiVendorExtensionServiceTest, RequestPathSuffixMatchingTest])
@IntegrationTest
class AllSpockTests {

	private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(AllSpockTests.class)

	@BeforeClass
	public static void setUpClass() {
		TestSetupUtils.loadData();
		TestSetupUtils.startServer();
	}

	@AfterClass
	public static void tearDown() {
		TestSetupUtils.stopServer();
		TestSetupUtils.cleanData();
	}

	@Test
	public static void testing() {
		//dummy test class
	}
}
