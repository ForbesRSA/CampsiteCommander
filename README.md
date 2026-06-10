# CampsiteCommander
##Pseudocode
start 
     Splash Screen
DISPLAY Composite Commander logo
DIPSLAY Composite Commander Title

Wait 3 seconds

OPEN Spash Screen

END Splash Screen

Start Main Screen 

DECLARE ItemNames Array
DECLARE Categories Array
DECLARE Quantities Array
DECLARE Comments Array

ADD Sample Data To Arrays

Calc Calculate Total Items
DISPLAY  TotalItemsPacked
When Add gearis Clicked 
     If input field is empty THEN
     Display Error Message
Else
ADD item name to itemNames array
ADD category to categoties array
ADD quantity to quantites array
ADD comment to comments array
CALC Calculate total items added
ENDIF
END WHEN
    View details button is clicked 
    OPEN detailed view screen 
END WHEN
END Main Screen

Function Calculate Total Items 
SET Total = 0
For Each Quantity in quantites arrays
Total=total +quantity
ENDFOR

DISPLAY Total
END FUNCTION

Start detailed view screen 
FOR every item in arrays

DISPLAY itemname
DISPLAY category
DISPLAY quantity
DISPLAY comment

WHEN Back to base button is clicked 
Return to main screen

END WHEN
END detailed view screen

Error Handling 
IF item name is Empty OR
   Category is Empty OR
   Quantity is Empty OR
   Comments is Empty

   DISPLAY "Please complete all fields"

   ELSE 
       Save data to arrays
   END

   Sample Data 
   Item Names=[Tent,Marshmallows,Flashlight]
  Categories=[Shelter,FOod,Safety]
  Quantites =[1,2,3]
#how the app works 
the splash screen is the first screen in the app this ha the logo and name 
the second screen is the main screen this is where most of the work happens such as the spinner,view details and add gear button
lastly is the detailed view screen, this is where the user will input their values
