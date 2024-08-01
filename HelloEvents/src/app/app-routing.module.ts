import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './Components/register/register.component';
import { LoginComponent } from './Components/login/login.component';
import { DashbordComponent } from './Components/dashbord/dashbord.component';
import { AllUserComponent } from './Components/all-user/all-user.component';

const routes: Routes = [
  {path: "register", component: RegisterComponent },
  {path: "login", component: LoginComponent },
  { path: 'user-dashboard', component: DashbordComponent },
  { path: 'admin-dashboard', component: AllUserComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
