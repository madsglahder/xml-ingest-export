package virksom;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import randomString.RandomString;

import javax.xml.bind.annotation.XmlValue;
import java.util.concurrent.ThreadLocalRandom;

@Root(name="form")
public class Form {

    //this huge class is huge for a reason
    //it follows the structure of test.xml
    //have it side by side when looking at this
    //or risk going insane

    //after adding even more I want to say I'm sorry
    //sorry you have to look at this
    //sorry you have to work with xml

    @Element(name="Virksomhedsinformation")
    private Virksomhedsinformation virksomhedsinformation;

    @Element(name="Indberetninger")
    private Indberetninger indberetninger;

    @Element(name="metadata")
    private Metadata metadata;

    public Virksomhedsinformation getVirksomhedsinformation() {
        return virksomhedsinformation;
    }

    public void setVirksomhedsinformation(Virksomhedsinformation virksomhedsinformation) {
        this.virksomhedsinformation = virksomhedsinformation;
    }

    public Indberetninger getIndberetninger() {
        return indberetninger;
    }

    public void setIndberetninger(Indberetninger indberetninger) {
        this.indberetninger = indberetninger;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    //insanity really begins here

    public static class Virksomhedsinformation {

        @Element
        private long vcvr;

        @Element
        private String vnavn;

        @Element
        private String vadresse;

        @Element
        private int vtlfnummer;

        @Element
        private String vemail;

        @Element
        private int vfax;

        @Element
        private int vbranchekode;

        @Element
        private String vtype;

        @Element(name="Anmelder")
        private Indberetninger.Anmelder anmelder;

        public long getVcvr() {
            return vcvr;
        }

        public void setVcvr(long vcvr) {
            this.vcvr = vcvr;
        }

        public String getVnavn() {
            return vnavn;
        }

        public void setVnavn(String vnavn) {
            this.vnavn = vnavn;
        }

        public String getVadresse() {
            return vadresse;
        }

        public void setVadresse(String vadresse) {
            this.vadresse = vadresse;
        }

        public int getVtlfnummer() {
            return vtlfnummer;
        }

        public void setVtlfnummer(int vtlfnummer) {
            this.vtlfnummer = vtlfnummer;
        }

        public String getVemail() {
            return vemail;
        }

        public void setVemail(String vemail) {
            this.vemail = vemail;
        }

        public int getVfax() {
            return vfax;
        }

        public void setVfax(int vfax) {
            this.vfax = vfax;
        }

        public int getVbranchekode() {
            return vbranchekode;
        }

        public void setVbranchekode(int vbranchekode) {
            this.vbranchekode = vbranchekode;
        }

        public String getVtype() {
            return vtype;
        }

        public void setVtype(String vtype) {
            this.vtype = vtype;
        }

        public Indberetninger.Anmelder getAnmelder() {
            return anmelder;
        }

        public void setAnmelder(Indberetninger.Anmelder anmelder) {
            this.anmelder = anmelder;
        }
    }

    public static class Indberetninger {

        @Element(name="grid-11")
        private Grid11 grid11;

        public Grid11 getGrid11() {
            return grid11;
        }

        public void setGrid11(Grid11 grid11) {
            this.grid11 = grid11;
        }

        public static class Grid11 {

            @Element(name="vstoetteordning")
            private String vstoetteordning;

            @Element(name="vbeloeb")
            private int vbeloeb;

            @Element(name="vaar")
            private int vaar;

            @Element(name="control-80")
            private String control80;

            public String getVstoetteordning() {
                return vstoetteordning;
            }

            public void setVstoetteordning(String vstoetteordning) {
                this.vstoetteordning = vstoetteordning;
            }

            public int getVbeloeb() {
                return vbeloeb;
            }

            public void setVbeloeb(int vbeloeb) {
                this.vbeloeb = vbeloeb;
            }

            public int getVaar() {
                return vaar;
            }

            public void setVaar(int vaar) {
                this.vaar = vaar;
            }

            public String getControl80() {
                return control80;
            }

            public void setControl80(String control80) {
                this.control80 = control80;
            }
        }

        public static class Anmelder {

            @Element(name="anmelderidentitet-navn")
            private String anmelderidentitetNavn;

            @Element(name="anmelderidentitet-cvr")
            private long anmelderidentitetCvr;

            @Element(name="anmelderidentitet-rid")
            private long anmelderidentitetRid;

            public String getAnmelderidentitetNavn() {
                return anmelderidentitetNavn;
            }

            public void setAnmelderidentitetNavn(String anmelderidentitetNavn) {
                this.anmelderidentitetNavn = anmelderidentitetNavn;
            }

            public long getAnmelderidentitetCvr() {
                return anmelderidentitetCvr;
            }

            public void setAnmelderidentitetCvr(long anmelderidentitetCvr) {
                this.anmelderidentitetCvr = anmelderidentitetCvr;
            }

            public long getAnmelderidentitetRid() {
                return anmelderidentitetRid;
            }

            public void setAnmelderidentitetRid(long anmelderidentitetRid) {
                this.anmelderidentitetRid = anmelderidentitetRid;
            }
        }
    }

    public static class Metadata {

        @Element(name="formmetadata")
        private Formmetadata formmetadata;

        public static class Formmetadata {

            @Element(name="formdata")
            private Formdata formdata;

            public static class Formdata {

                @Attribute
                private String name;

                @Attribute
                private String value;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

        }

        @Element(name="kvitteringsid")
        private Kvitteringsid kvitteringsid;

        public static class Kvitteringsid {

            @Attribute
            private String id;

            @Attribute
            private String name;

            @XmlValue
            private int kvitteringsid;

            public int getKvitteringsid() {
                return kvitteringsid;
            }

            public void setKvitteringsid(int kvitteringsid) {
                this.kvitteringsid = kvitteringsid;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        @Element(name="taellerBorgerID")
        private TaellerBorgerID taellerBorgerID;

        public static class TaellerBorgerID {

            @Attribute
            private String id;

            @Attribute
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        @Element(name="taellerIsActive")
        private TaellerIsActive taellerIsActive;

        public static class TaellerIsActive {

            @Attribute
            private String id;

            @Attribute
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        @Element(name="indsendtblanketmetadata")
        private Indsendtblanketmetadata indsendtblanketmetadata;

        public static class Indsendtblanketmetadata {

            @Element(name="indsendtblanket")
            private Indsendtblanket indsendtblanket;

            public Indsendtblanket getIndsendtblanket() {
                return indsendtblanket;
            }

            public void setIndsendtblanket(Indsendtblanket indsendtblanket) {
                this.indsendtblanket = indsendtblanket;
            }

            public static class Indsendtblanket {

                @Element(name="document_id")
                private DocumentId documentId;

                @Element(name="indsendt_blanket_id")
                private IndsendtBlanketId indsendtBlanketId;

                @Element(name="document_date")
                private DocumentDate documentDate;

                @Element(name="document_time")
                private DocumentTime documentTime;

                public static class DocumentId {

                    @Attribute
                    private String value;

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class IndsendtBlanketId {

                    @Attribute
                    private int value;

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DocumentDate {

                    @Attribute
                    private String value;

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class DocumentTime {

                    @Attribute
                    private String value;

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public DocumentId getDocumentId() {
                    return documentId;
                }

                public void setDocumentId(DocumentId documentId) {
                    this.documentId = documentId;
                }

                public IndsendtBlanketId getIndsendtBlanketId() {
                    return indsendtBlanketId;
                }

                public void setIndsendtBlanketId(IndsendtBlanketId indsendtBlanketId) {
                    this.indsendtBlanketId = indsendtBlanketId;
                }

                public DocumentDate getDocumentDate() {
                    return documentDate;
                }

                public void setDocumentDate(DocumentDate documentDate) {
                    this.documentDate = documentDate;
                }

                public DocumentTime getDocumentTime() {
                    return documentTime;
                }

                public void setDocumentTime(DocumentTime documentTime) {
                    this.documentTime = documentTime;
                }
            }

        }

        public Formmetadata getFormmetadata() {
            return formmetadata;
        }

        public void setFormmetadata(Formmetadata formmetadata) {
            this.formmetadata = formmetadata;
        }

        public Kvitteringsid getKvitteringsid() {
            return kvitteringsid;
        }

        public void setKvitteringsid(Kvitteringsid kvitteringsid) {
            this.kvitteringsid = kvitteringsid;
        }

        public TaellerBorgerID getTaellerBorgerID() {
            return taellerBorgerID;
        }

        public void setTaellerBorgerID(TaellerBorgerID taellerBorgerID) {
            this.taellerBorgerID = taellerBorgerID;
        }

        public TaellerIsActive getTaellerIsActive() {
            return taellerIsActive;
        }

        public void setTaellerIsActive(TaellerIsActive taellerIsActive) {
            this.taellerIsActive = taellerIsActive;
        }

        public Indsendtblanketmetadata getIndsendtblanketmetadata() {
            return indsendtblanketmetadata;
        }

        public void setIndsendtblanketmetadata(Indsendtblanketmetadata indsendtblanketmetadata) {
            this.indsendtblanketmetadata = indsendtblanketmetadata;
        }
    }

    //nested class insanity ends here
    //methods for altering begins here
    //is there a better way for exposing nested class methods
    //that also works for xml libs?

    public void alterVcvr(long cvr) {
        this.virksomhedsinformation.setVcvr(cvr);
    }

    public void alterVnavn(String vnavn) {
        this.virksomhedsinformation.setVnavn(vnavn);
    }

    public void alterVaddresse(String vaddresse) {
        this.virksomhedsinformation.setVadresse(vaddresse);
    }

    public void alterVtlfnummer(int tlfnummer) {
        this.virksomhedsinformation.setVtlfnummer(tlfnummer);
    }

    public void alterVemail(String email) {
        this.virksomhedsinformation.setVemail(email);
    }

    public void alterVfax(int fax) {
        this.virksomhedsinformation.setVfax(fax);
    }

    public void alterVbranchecode(int code) {
        this.virksomhedsinformation.setVbranchekode(code);
    }

    public void alterVtype(String type) {
        this.virksomhedsinformation.setVtype(type);
    }

    public void alterAnmelderNavn(String navn) {
        this.virksomhedsinformation.anmelder.setAnmelderidentitetNavn(navn);
    }

    public void alterAnmelderCvr(long cvr) {
        this.virksomhedsinformation.anmelder.setAnmelderidentitetCvr(cvr);
    }

    public void alterAnmelderRid(long rid) {
        this.virksomhedsinformation.anmelder.setAnmelderidentitetRid(rid);
    }

    public void alterIndberedningGrid11Vstoetteordning(String ordning) {
        this.indberetninger.grid11.setVstoetteordning(ordning);
    }

    public void alterIndberetningGrid11Vbeloeb(int value) {
        this.indberetninger.grid11.setVbeloeb(value);
    }

    public void alterInderetningGrid11Vaar(int year) {
        this.indberetninger.grid11.setVaar(year);
    }

    public void alterMetadataFormdataName(String name) {
        this.metadata.formmetadata.formdata.setName(name);
    }

    public void alterMetadataFormdataValue(String value) {
        this.metadata.formmetadata.formdata.setValue(value);
    }

    public void alterMetadataKvitteringId(String id) {
        this.metadata.kvitteringsid.setId(id);
    }

    public void alterMetadataKvitteringName(String name) {
        this.metadata.kvitteringsid.setName(name);
    }

    public void alterMetadataKvitteringValue(int value) {
        this.metadata.kvitteringsid.setKvitteringsid(value);
    }

    public void alterMetadataTaellerBorgerId(String id) {
        this.metadata.taellerBorgerID.setId(id);
    }

    public void alterMetadataTaellerBorgerName(String name) {
        this.metadata.taellerBorgerID.setName(name);
    }


    public void alterMetadataTaellerIsActive(String id) {
        this.metadata.taellerIsActive.setId(id);
    }

    public void alterMetadataTaellerBorgerIsActive(String name) {
        this.metadata.taellerIsActive.setName(name);
    }

    public void alterMetadataIndsendtDocId(String value) {
        this.metadata.indsendtblanketmetadata.indsendtblanket.documentDate.setValue(value);
    }

    public void alterMetadataIndsendtFormId(String value) {
        this.metadata.indsendtblanketmetadata.indsendtblanket.documentId.setValue(value);
    }

    public void alterMetadataIndsendtDocDate(String date) {
        this.metadata.indsendtblanketmetadata.indsendtblanket.documentDate.setValue(date);
    }

    public void alterMetadataIndsendtDocTime(String time) {
        this.metadata.indsendtblanketmetadata.indsendtblanket.documentTime.setValue(time);
    }

    public void alterMetadataIndsendtblanketetIndsendtBlanketId(int value) {
        this.metadata.indsendtblanketmetadata.indsendtblanket.indsendtBlanketId.setValue(value);
    }

    public void alterIndberetningerGrid11Control80(String date) {

    }

    //this just means less typing below
    //even if it looks ugly as sin
    public int randomInt() {
        return ThreadLocalRandom.current().nextInt();
    }

    public long randomLong() {
        return ThreadLocalRandom.current().nextLong();
    }

    public void randomizeFields() {

        //be uhh, careful
        //i guess worst you can always reload the xml

        RandomString randomString = new RandomString();

        this.alterVcvr(this.randomLong());
        this.alterVaddresse(randomString.nextString());
        this.alterVnavn(randomString.nextString());
        this.alterVaddresse(randomString.nextString());
        this.alterVtlfnummer(this.randomInt());
        this.alterVemail(randomString.nextString());
        this.alterVfax(this.randomInt());
        this.alterVbranchecode(this.randomInt());
        this.alterVtype(randomString.nextString());

        this.alterAnmelderNavn(randomString.nextString());
        this.alterAnmelderCvr(this.randomLong());
        this.alterAnmelderRid(this.randomLong());

        this.alterIndberedningGrid11Vstoetteordning(randomString.nextString());
        this.alterIndberetningGrid11Vbeloeb(this.randomInt());
        this.alterInderetningGrid11Vaar(this.randomInt());

        this.alterMetadataFormdataName(randomString.nextString());
        this.alterMetadataFormdataValue(randomString.nextString());
        this.alterMetadataKvitteringId(randomString.nextString());
        this.alterMetadataKvitteringName(randomString.nextString());
        this.alterMetadataKvitteringValue(randomInt());
        this.alterMetadataIndsendtDocId(randomString.nextString());
        this.alterMetadataIndsendtFormId(randomString.nextString());
        this.alterMetadataIndsendtDocDate(randomString.nextString());
        this.alterMetadataIndsendtDocTime(randomString.nextString());
        this.alterMetadataIndsendtblanketetIndsendtBlanketId(randomInt());

        this.alterMetadataTaellerBorgerId(randomString.nextString());
        this.alterMetadataTaellerBorgerName(randomString.nextString());
        this.alterMetadataTaellerBorgerIsActive(randomString.nextString());
        this.alterMetadataTaellerIsActive(randomString.nextString());

    }
}

