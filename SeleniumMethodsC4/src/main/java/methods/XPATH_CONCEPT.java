package methods;

public class XPATH_CONCEPT {
	XPATH
	==========
	//Basic XPath
	===============
	//USERID
	============
	//input[@name='uid']
	//input[@type='text']
	//input[@onkeyup='validateuserid();']
	//input[@onblur='validateuserid();']
	//Login
	========
	//input[@type='submit']
	//input[@value='LOGIN']
	//input[@name='btnLogin']
	//Contains
	============
	//input[contains(@type, 'reset')]
	//input[contains(@type, 'sub')]
	//label[contains(text(), 'User-ID must not be blank')]
	//OR and AND
	============
	//input[@type='submit' or @value='LOGIN']
	//input[@type='submit' or @name='btnLogin']
	//starts-with function
	========================
	//label[starts-with(@id, 'message')]
	//text()
	==============
	//td[text()='UserID']
	//label[text()='User-ID must not be blank']
	//following
	===============
	//*[@type='password']//following::input[2]
	//*[@type='password']//following::input[1]
	//*[@type='password']//following::input
	//ancestor == axis
	==================
	//*[text()='Testing']//ancestor::div
	//*[text()='Testing']//ancestor::div[1]
	//child
	=========
	//*[@id='java_technologies']//child::li[1]
	//*[@id='java_technologies']//child::li
	//preceding
	==========
	//*[@type='submit']//preceding::input
	//*[@type='reset']//preceding::input
	//following-sibling
	====================
	//*[@type='submit']//following-sibling::input
	//parent
	========
	//*[@id='java_technologies']//parent::div
}
