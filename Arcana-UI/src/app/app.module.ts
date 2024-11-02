import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { SpellbookComponent } from './spellbook/spellbook.component';

@NgModule({
  declarations: [
    // AppComponent,   
    // SpellbookComponent  
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: []  
})
export class AppModule { }
