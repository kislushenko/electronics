# electronics

Setup guide

1. Clone the repository to this folder: PATH_TO_PROJECT/hybris/bin/custom/
 
2. Create symlink to config folder:
    - Windows: mklink /D "PATH_TO_PROJECT\hybris\config" "PATH_TO_PROJECT\hybris\bin\custom\electronics\config"
    - Mac OS:  ln -s "PATH_TO_PROJECT/hybris/bin/custom/electronics/config" "PATH_TO_PROJECT/hybris/config"

3. Install addons:
ant addoninstall -Daddonnames="adaptivesearchsamplesaddon,assistedservicecustomerinterestsaddon,assistedservicepromotionaddon,assistedservicestorefront,assistedserviceyprofileaddon,captchaaddon,configurablebundleaddon,consignmenttrackingaddon,customercouponaddon,customercouponsamplesaddon,customerinterestsaddon,customerticketingaddon,eventtrackingwsaddon,merchandisingaddon,merchandisingstorefrontsampledataaddon,multicountrysampledataaddon,notificationaddon,ordermanagementaddon,orderselfserviceaddon,pcmbackofficesamplesaddon,personalizationaddon,personalizationsampledataaddon,personalizationyprofilesampledataaddon,profiletagaddon,selectivecartsplitlistaddon,smarteditaddon,stocknotificationaddon,textfieldconfiguratortemplateaddon,timedaccesspromotionengineaddon,timedaccesspromotionenginesamplesaddon,xyformssamples,xyformsstorefrontcommons,ysapproductconfigaddon" -DaddonStorefront.yacceleratorstorefront="electronicsstorefront"

4. ant clean all initialize

5. Start the server and spartacus application

6. http://localhost:4200/
