# 🌱 EcoEats: Submission for cmd-f 2020
## The problem 
Climate change is a problem effecting everyone. Often we are told that small changes can create a large impact, yet small changes are usually unnoticeable which can be discourging. 

## Our solution 
EcoEats allows users to take a picture of their food and see the impact that the food production has on the environment. The water usage and the CO2 emissions of the food are shown to the user. The CO2 emissions are displayed to the user in terms of trees required to be planted and kilometres driven in a car so that the user can see their impact in a quantifiable and intuitive way.   

## How we built it
We used android studio to built an app in Java. We were able to connec to the phone's camera to directly send a photo to Google's Cloud Vision API, which we also connected to the app. Figma was used to wireframe and think out our UI, and finally we used xml to connect the backend of the app with the front end. 

## Challenges we ran into 
FIREBASE! I really wanted to use this but since I was unfamiliar with all the SDK versions/libraries, I had trouble integrating older Java libraries with newer Java libraries that Firebase required, so that was eventually scrapped. Another issue we ran into was finding a free API for the carbon emmissions. After hours of search we were unable to get the API key, so we had to make a database ourselves.

## Accomplishments we are proud of
Getting the app to work! We all wanted to use kotlin in our app, but time constraints meant we could not waste time learning new syntax and had to turn to good(or bad?) ole Java. We are also proud of the product we made, with a well thought out front end and working back end. 

## What we learned 
We learned how to build an android app! We also witnessed the process of wireframing and integrating the front end and back end of an android app. We also learned that an app in Java is incredibly difficult!

## What's next 
I really wanted to use Firebase in this app. While I connected to firebase, our team were all new hackers (besides one teammate, myself) and I had went in over my head. Thus the next logical step would be to itegrate Firebase into our app so we can introduce features such as user authentication, personal statistic tracking and meal comparison. 

## How to check it out yourself?
I had to delete the key for the Google Cloud API (due to security), however in the future I plan on continuing to develop this app using firebase to leverage the ML kit I had hoped to use at the hackathon. In the mean time hold tight! 
