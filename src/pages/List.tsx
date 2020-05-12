import { IonButtons, IonContent, IonHeader, IonIcon, IonItem, IonList, IonMenuButton, IonPage, IonTitle, IonToolbar, IonCardHeader, IonCardContent, IonCard } from '@ionic/react';
import { americanFootball, basketball, beer, bluetooth, boat, build, flask, football, paperPlane, wifi, construct } from 'ionicons/icons';
import React, { constructor } from 'react';
import './collapsible.css';
import { createRenderer } from 'react-dom/test-utils';
const ListPage: React.FC = () => {
  // var accordianExpanded =false;
  // function accordian(){
  //   if(accordianExpanded){
  //       return(

  //       )
  //   }
  //   else{

  //   }
  // }
  return (
    // // <IonPage>
    // //   <IonHeader>
    // //     <IonToolbar>
    // //       <IonButtons slot="start">
    // //         <IonMenuButton />
    // //       </IonButtons>
    // //       <IonTitle>List</IonTitle>
    // //     </IonToolbar>
    // //   </IonHeader>

    // //   <IonContent>
    //     <IonCard>
    //       <IonCardHeader onClick={accordian} className="ion-header">
    //          Tab 1
    //       </IonCardHeader>
    //       <IonCardContent className="ion-content">
    //         Content goes here ....
    //       </IonCardContent>
    //     </IonCard>
    //   </IonContent>

    // </IonPage>
    <IonPage>
      <IonHeader>
         <IonToolbar>
         <IonButtons slot="start">
         <IonMenuButton />
        </IonButtons>
        <IonTitle>List</IonTitle>
       </IonToolbar>
     </IonHeader>

   <IonContent>
    <div className="accordion vertical">
    <ul>
        <li>
            <input type="radio" id="radio-1" name="radio-accordion"  />
            <label  htmlFor="radio-1">Theft&nbsp;Precaurions</label>
            <div className="content">
                <h3>This is an example accordion item</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse nec posuere lorem. Pellentesque hendrerit, lorem luctus porttitor vestibulum, eros sapien mattis libero, euismod congue neque nisi at ipsum. Mauris semper ipsum sit amet metus semper malesuada. Donec vel est justo, ac porta diam.</p>
                <p>In ut est in orci commodo blandit. Cras rhoncus ultricies augue. Proin quam odio, venenatis ut tempus tristique, aliquet in velit. Pellentesque volutpat facilisis orci, ut congue mi rhoncus at. Nullam vehicula dignissim neque, sed rhoncus magna ultricies et.</p>
            </div>
        </li>
        <li>
            <input type="radio" id="radio-2" name="radio-accordion" />
            <label htmlFor="radio-2">Kidnapping&nbsp;Precaution</label>
            <div className="content">
                <h3>Totally another one right here</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse nec posuere lorem. Pellentesque hendrerit, lorem luctus porttitor vestibulum, eros sapien mattis libero, euismod congue neque nisi at ipsum. Mauris semper ipsum sit amet metus semper malesuada. Donec vel est justo, ac porta diam.</p>
                <p>In ut est in orci commodo blandit. Cras rhoncus ultricies augue. Proin quam odio, venenatis ut tempus tristique, aliquet in velit. Pellentesque volutpat facilisis orci, ut congue mi rhoncus at. Nullam vehicula dignissim neque, sed rhoncus magna ultricies et.</p>
            </div>
        </li>
        <li>
            <input type="radio" id="radio-3" name="radio-accordion" />
            <label  htmlFor="radio-3">Somethin&nbsp;Precaution</label>
            <div className="content">
                <h3>I think I can go on forever</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse nec posuere lorem. Pellentesque hendrerit, lorem luctus porttitor vestibulum, eros sapien mattis libero, euismod congue neque nisi at ipsum. Mauris semper ipsum sit amet metus semper malesuada. Donec vel est justo, ac porta diam.</p>
                <p>In ut est in orci commodo blandit. Cras rhoncus ultricies augue. Proin quam odio, venenatis ut tempus tristique, aliquet in velit. Pellentesque volutpat facilisis orci, ut congue mi rhoncus at. Nullam vehicula dignissim neque, sed rhoncus magna ultricies et.</p>
            </div>
        </li>
        <li>
            <input type="radio" id="radio-4" name="radio-accordion" />
            <label  htmlFor="radio-4">Something&nbsp;Precaution</label>
            <div className="content">
                <h3>I was wrong, I'm done</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse nec posuere lorem. Pellentesque hendrerit, lorem luctus porttitor vestibulum, eros sapien mattis libero, euismod congue neque nisi at ipsum. Mauris semper ipsum sit amet metus semper malesuada. Donec vel est justo, ac porta diam.</p>
                <p>In ut est in orci commodo blandit. Cras rhoncus ultricies augue. Proin quam odio, venenatis ut tempus tristique, aliquet in velit. Pellentesque volutpat facilisis orci, ut congue mi rhoncus at. Nullam vehicula dignissim neque, sed rhoncus magna ultricies et.</p>
            </div>
        </li>
    </ul>
</div>
</IonContent></IonPage>
  );
};

export default ListPage;
