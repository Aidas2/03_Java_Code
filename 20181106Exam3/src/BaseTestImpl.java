import lt.itakademija.*;

import java.util.Iterator;

public class BaseTestImpl extends BaseTest {
    @Override
    protected DocumentOrganizer createDocumentOrganizer(DocumentTypeDetector documentTypeDetector) {
        return new DocumentOrganizerImpl();
    }

    @Override
    protected DocumentProducer createDocumentProducer(Iterator<Document> iterator) {
        return new DocumentProducerImpl();
    }

    @Override
    protected DocumentConsumer createDocumentConsumer(FileRepository fileRepository) {
        return new DocumentConsumerImpl();
    }
}
