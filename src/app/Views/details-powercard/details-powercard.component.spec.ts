import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsPowercardComponent } from './details-powercard.component';

describe('DetailsPowercardComponent', () => {
  let component: DetailsPowercardComponent;
  let fixture: ComponentFixture<DetailsPowercardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsPowercardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsPowercardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
