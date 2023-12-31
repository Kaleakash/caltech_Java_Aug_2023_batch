import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { LoginService } from './login.service';
import { AppComponent } from './app.component';
import { LoginTdfComponent } from './login-tdf/login-tdf.component';
import { LoginMdfComponent } from './login-mdf/login-mdf.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    LoginTdfComponent,
    LoginMdfComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule
  ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
