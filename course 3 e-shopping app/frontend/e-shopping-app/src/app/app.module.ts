import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { CustomerhomeComponent } from './customerhome/customerhome.component';
import { ProductbyadminComponent } from './productbyadmin/productbyadmin.component';
import { ProductbycustomerComponent } from './productbycustomer/productbycustomer.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    DashboardComponent,
    AdminhomeComponent,
    CustomerhomeComponent,
    ProductbyadminComponent,
    ProductbycustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
