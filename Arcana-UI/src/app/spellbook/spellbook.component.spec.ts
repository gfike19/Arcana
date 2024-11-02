import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SpellbookComponent } from './spellbook.component';

describe('SpellbookComponent', () => {
  let component: SpellbookComponent;
  let fixture: ComponentFixture<SpellbookComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SpellbookComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SpellbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
