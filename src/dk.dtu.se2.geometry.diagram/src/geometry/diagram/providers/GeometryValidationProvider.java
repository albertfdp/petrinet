package geometry.diagram.providers;

import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.part.GeometryDiagramEditorPlugin;
import geometry.diagram.part.GeometryVisualIDRegistry;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryValidationProvider.
 *
 * @generated
 */
public class GeometryValidationProvider {

	/** The constraints active. @generated */
	private static boolean constraintsActive = false;

	/**
	 * Should constraints be private.
	 *
	 * @return true, if successful
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * Run with constraints.
	 *
	 * @param editingDomain the editing domain
	 * @param operation the operation
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				GeometryDiagramEditorPlugin.getInstance().logError(
						"Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * Checks if is in default editor context.
	 *
	 * @param object the object
	 * @return true, if is in default editor context
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& GeometryEditPart.MODEL_ID
							.equals(GeometryVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

}
