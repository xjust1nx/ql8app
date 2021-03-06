package ql.cev.ql7.Fragments;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import ql.cev.ql7.ContactAdapter;
import ql.cev.ql7.ContactListModel;
import ql.cev.ql7.R;



public class ContactFragment extends Fragment{
    private String[] Positions = {
            "CHAIRMAN",
            "VICE CHAIRMAN",
            "GEN. SECRETARY",
            "JOINT SECRETARY",
            "UUC",
            "FINE ARTS SEC.",
            "GEN. CAPTAIN",
            "MAGAZINE EDITOR",
            "",
            "CS",
            "CE",
            "EEE",
            "IT",
            "EC",
            "EI",
            "MCA",
            "",
            "CHAIRMAN",
            "GEN. CONVENOR",
            "TECHNICAL HEAD",
            "CULTURAL HEAD",

    } ;
    private String[] Names = {
            "MINNU",
            "KC ANAGHA CHANDRAN",
            "SADIQUE",
            "AISWARYA PV",
            "VARUN A",
            "SREENATH TK",
            "HATHIF BACKER",
            "PRASOBH V",
            "ASSOCIATION SEC.",
            "ARUN A",
            "AMAL SUGUNAN",
            "SYAM P S",
            "SARATH C",
            "ARJUN ANAND",
            "AKSHAY RAMESH",
            "HUSSAIN M K",
            "GENERAL CONVENORS",
            "MINNU",
            "SADIQUE",
            "PREMJISHNU",
            "SREENATH T K",


    } ;
    private String[] PhoneNumber = {
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "",
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "9999999999",
            "",
            "9999999999",
            "9999999999",
            "9999999999 ",
            "9999999999",
    } ;



    private ArrayList<ContactListModel> ContactArray = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_contact,container,false);
        setListData();
        Resources resources=getResources();
        ListView listview =(ListView)view.findViewById(R.id.contact_list_view);
        ContactAdapter contactAdapter=new ContactAdapter(getActivity(),ContactArray,resources);
         listview.setAdapter(contactAdapter);
        return view;
    }

    private void setListData() {
        for (int i=0;i<21;i++){
            final ContactListModel contactListModel=new ContactListModel();
            contactListModel.setPosition(Positions[i]);
            contactListModel.setName(Names[i]);
            contactListModel.setContactNumber(PhoneNumber[i]);
            ContactArray.add(contactListModel);
        }
    }

}
