import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateGroupPollComponent } from './create-group-poll.component';

describe('CreateGroupPollComponent', () => {
  let component: CreateGroupPollComponent;
  let fixture: ComponentFixture<CreateGroupPollComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateGroupPollComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateGroupPollComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
