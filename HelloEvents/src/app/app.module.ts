import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InscriptionComponent } from './Components/inscription/inscription.component';
import { GestioncontactComponent } from './Components/gestioncontact/gestioncontact.component';
import { HttpClientModule } from '@angular/common/http';
import { RegisterComponent } from './Components/register/register.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './Components/login/login.component';

import { DashbordComponent } from './Components/dashbord/dashbord.component';
import { AllUserComponent } from './Components/all-user/all-user.component';
@NgModule({
  declarations: [
    AppComponent,
    InscriptionComponent,
    GestioncontactComponent
    RegisterComponent,
    LoginComponent,
    DashbordComponent,
    AllUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
    
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
