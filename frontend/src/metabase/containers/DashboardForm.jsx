import React from "react";
import { t } from "c-3po";
import EntityForm from "metabase/entities/containers/EntityForm";
import ModalContent from "metabase/components/ModalContent";

const DashboardForm = ({ dashboard, onClose, ...props }) => (
  <ModalContent
    title={
      dashboard && dashboard.id != null ? dashboard.name : t`New dashboard`
    }
    onClose={onClose}
  >
    <EntityForm entityType="dashboards" entityObject={dashboard} {...props} />
  </ModalContent>
);

export default DashboardForm;
