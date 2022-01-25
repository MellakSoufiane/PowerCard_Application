import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PowercardComponent } from './powercard.component';

describe('PowercardComponent', () => {
  let component: PowercardComponent;
  let fixture: ComponentFixture<PowercardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PowercardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PowercardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
